package pl.dorotamiler.kidstherapy.model.domain;

import pl.dorotamiler.kidstherapy.util.PeselException;

public class Pesel {

    private final String pesel;
    private boolean correct;

    public Pesel(String pesel) throws PeselException {
//        if (pesel.length() != 11) {
//            throw PeselException.peselNotValid();
//        }
        this.pesel = pesel;
        this.correct=false;
    }

    public String getPesel() {
        return pesel;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public final boolean isCorrect() {
        return correct;
    }

    @Override
    public String toString() {
        return "Pesel = "
                + pesel;
    }
}