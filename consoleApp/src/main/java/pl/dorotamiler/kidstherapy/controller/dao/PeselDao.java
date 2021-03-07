package pl.dorotamiler.kidstherapy.controller.dao;

public interface PeselDao {

    // Pesel nr validation check
    void validate();

    String preparePeselNumber(String number);

    //    Checks pesel nr structure: length, if consists of digits
//            @return true if structure accurate
    boolean isAccurate();

}