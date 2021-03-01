package pl.dorotamiler.kidstherapy.util;

public enum ValidatorEnum {

    POLISH_SIGNS("[a-zA-ZżźćńółęąśŻŹĆĄŚĘŁÓŃ -]+", "Only polish signs allowed"),
    PHONE_NUMBER("^\\d{9}$", "Error - only 9 digit-phone number allowed"),
    YES_NO("[yYnN]", "Please enter 'Y' or 'N' letter"),
    E_MAIL("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,9}$", "Correct form: tomek@gmail.com");

    private String regex;
    private String message;


    ValidatorEnum(String regex, String message) {
        this.regex = regex;
        this.message = message;
    }

    public String getRegex() {
        return regex;
    }

    public String getMessage() {
        return message;
    }
}