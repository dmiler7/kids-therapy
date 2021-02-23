package pl.dorotamiler.kidstherapy.dao;

public class Pesel {

    private String pesel;

    public Pesel(String pesel) {
        this.pesel = pesel;
    }

    public String getPesel() {
        return pesel;
    }

    @Override
    public String toString() {
        return "Pesel = " +
                +pesel;
    }
}