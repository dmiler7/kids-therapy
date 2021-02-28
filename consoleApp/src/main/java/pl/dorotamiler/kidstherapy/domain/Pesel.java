package pl.dorotamiler.kidstherapy.domain;

public class Pesel {

    private final String pesel;

    public Pesel(String pesel) {
        if (pesel.length() != 11) {
            throw new IllegalArgumentException("pesel number " +
                    "invalid due to not accurate " +
                    "number of digits. Please revise.");
        }
        this.pesel = pesel;
    }

    public String getPesel() {
        return pesel;
    }

    @Override
    public String toString() {
        return "Pesel = "
                + pesel;
    }
}