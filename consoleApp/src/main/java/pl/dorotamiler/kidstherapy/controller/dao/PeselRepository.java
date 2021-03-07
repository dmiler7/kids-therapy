package pl.dorotamiler.kidstherapy.controller.dao;

import pl.dorotamiler.kidstherapy.model.Pesel;
import pl.dorotamiler.kidstherapy.model.util.PeselException;

public class PeselRepository extends Pesel implements PeselDao {

    public PeselRepository(String pesel) throws PeselException {
        super(pesel);
    }

    @Override
    public void validate() {
        int[] peselTable = new int[11];
        for(int i=0; i<11; i++){
            peselTable[i]=Character.getNumericValue(super.getPesel().charAt(i));
        }

    }

    @Override
    public String preparePeselNumber(String number) {
        number = number.toUpperCase();
        number.trim();
        number = number.replaceAll("\\s+", "");
        StringBuilder strBuilder = new StringBuilder();
        for (char character : number.toCharArray()) {
            if (Character.isDigit(character)) {
                strBuilder.append(character);
            }
        }
        return strBuilder.toString();
    }

    @Override
    public boolean isAccurate() {
        boolean peselAccurate = true;
        if (super.getPesel() == null || "".equals(super.getPesel()) || super.getPesel().length() != 11) {
            peselAccurate = false;
        }
        return peselAccurate;
    }
}