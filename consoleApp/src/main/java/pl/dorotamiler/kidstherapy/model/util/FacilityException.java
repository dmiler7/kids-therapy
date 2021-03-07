package pl.dorotamiler.kidstherapy.model.util;

public class FacilityException extends Throwable {
    public static final int FACILITY_NOT_FOUND_ERROR_CODE = 1000;
    public static final int FACILITY_ALREADY_EXISTS_ERROR_CODE = 1001;
    private String message;

    public FacilityException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public static FacilityException facilityNotFound(String name) {
        return new FacilityException("Error code: " + FACILITY_NOT_FOUND_ERROR_CODE + " -> searched facility :" + name + " is not found.");
    }

    public static FacilityException facilityAlreadyExists(String name) {
        return new FacilityException("Error code: " + FACILITY_ALREADY_EXISTS_ERROR_CODE + " -> searched facility :" + name + " already exists.");
    }
}