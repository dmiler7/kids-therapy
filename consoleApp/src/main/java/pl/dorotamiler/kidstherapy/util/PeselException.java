package pl.dorotamiler.kidstherapy.util;

public class PeselException extends Throwable {

    public static final int PESEL_VALIDATION_ERROR_CODE = 2000;
    public static final int PESEL_EXISTS_ERROR_CODE = 2001;
    public static final int PESEL_EMPTY_OR_NULL_ERROR_CODE = 2002;

    private String message;
    private int code;

    PeselException(String message, int code) {
        this.message = message;
        this.code = code;
    }

//   TODO implement this validation in User/Patient's feature in accurate place;
//    public boolean isPeselValid() {
//        return !pesel.isEmpty();
//    }

    @Override
    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }
}