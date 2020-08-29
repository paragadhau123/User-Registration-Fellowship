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

    }
    @Test
    public void givenLastName_WhenProper_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Adhau");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("adg");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("abc+111@yahoo.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("abc()*@gmail.com");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPhone_WhenProper_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePhone("91 9604445258");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPhone_WhenNotProper_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePhone("8105215414");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("abcdfdA@#fg0");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("adasdas0daS");
        Assert.assertEquals(false, result);
    }
}


