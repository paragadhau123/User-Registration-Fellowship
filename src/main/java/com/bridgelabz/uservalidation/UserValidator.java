package com.bridgelabz.uservalidation;

import java.util.regex.Pattern;

public class  UserValidator {

    private final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    private final String EMAIL_PATTERN = "^[a-z]+[A-Z0-9.+_-]+[@][a-zA-Z0-9]+[.]co(m|.in)$";
    private final String PHONE_PATTERN = "^[1-9][0-9]+[ ]{0,1}+[1-9][0-9]{9}$";
    private final String PASSWORD_PATTERN = "(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%!]{1}).{8,}";

    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }

    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }

    public boolean validatePhone(String phone) {
        Pattern pattern = Pattern.compile(PHONE_PATTERN);
        return pattern.matcher(phone).matches();
    }

    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }
}
