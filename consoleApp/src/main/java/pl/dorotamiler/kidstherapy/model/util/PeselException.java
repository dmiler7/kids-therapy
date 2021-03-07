package pl.dorotamiler.kidstherapy.model.util;

public class PeselException extends Throwable {

    public static final int PESEL_EMPTY_OR_NULL_ERROR_CODE = 2000;
    public static final int PESEL_EXISTS_ERROR_CODE = 2001;
    public static final int PESEL_VALIDATION_ERROR_CODE = 2002;

    private String message;

    public PeselException(String message) {
        this.message = message;
    }

//   TODO implement this validation in User/Patient's feature in accurate place;
//    public boolean isPeselValid() {
//        return !pesel.isEmpty();
//    }

    @Override
    public String getMessage() {
        return message;
    }

    public static PeselException peselNotValid() {
        return new PeselException("Error code: " + PESEL_VALIDATION_ERROR_CODE + " -> given pesel number :" + pesel + " is not valid due to inaccurate number of digits.");
    }

    public static PeselException peselAlreadyExists() {
        return new PeselException("Error code: " + PESEL_EXISTS_ERROR_CODE + " -> given pesel number :" + pesel + " already exists.");
    }

    public static PeselException peselEmptyOrNull() {
        return new PeselException("Error code: " + PESEL_EMPTY_OR_NULL_ERROR_CODE + " -> given pesel number :" + pesel + " is empty.");
    }
}