import com.bridgelabz.userregistration.UserValidator;
import org.junit.Assert;
import org.junit.Test;

public class TestUserValidator {
    @Test
    public void givenFirstName_WhenFirstNameStartsWithCapitalLetter_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("Parag");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenFirstNameNotStartsWithCapitalLetter_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("parag");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenFirstName_WhenFirstNameHaveMinimumThreeLetters_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("Par");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenFirstNameNotHaveMinimumThreeLetters_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("Pa");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenLastNameStartsWithCapitalLetter_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Adhau");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenLastNameNotStartsWithCapitalLetter_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("adhau");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenLastName_WhenLastNameHaveMinimumThreeLetter_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Adh");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenLastName_WhenLastNameNotHaveMinimumThreeLetter_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("ad");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmail_WhenEmailStartsWithSmallLetter_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("adhauparag64@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenEmailNotStartsWithSmallLetter_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("Abc@gmail.com");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmail_WhenEmailEndsWithComOrIn_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("abc111@yahoo.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenEmailNotEndsWithComOrIn_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("Abc@gmail.kjnk");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsFollowedByCountryCode_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePhone("91 9604445258");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsNotFollowedByCountryCode_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePhone("8105215414");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsTenDigit_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePhone("91 9604445258");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsNotTenDigit_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePhone("91 8105215");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WhenPasswordIsMinimumEightDigit_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("Parag234$");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenPasswordIsNotMinimumEightDigit_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("adas");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenPassword_WhenPasswordHaveAtleastOneCapitalLetter_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("Parag234$");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPassword_WhenPasswordNotHaveAtleastOneCapitalLetter_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("adased@");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenPassword_WhenPasswordHaveAtleastOneNumericNumber_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("Paragadhau2$");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPassword_WhenPasswordNotHaveAtleastOneNumericNumber_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("adased@");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenPassword_WhenPasswordHaveAtleastOneSpeacialCharacter_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("Parag234$");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPassword_WhenPasswordNotHaveAtleastOneSpeacialCharacter_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("adased123");
        Assert.assertEquals(false, result);
    }
}


