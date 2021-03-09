package pl.dorotamiler.kidstherapy.storage;

import pl.dorotamiler.kidstherapy.domain.Address;
import pl.dorotamiler.kidstherapy.domain.Patient;
import pl.dorotamiler.kidstherapy.domain.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientDb {
    private static List<Patient> patients = new ArrayList<>();

    public static List<Patient> getAllPatients() {
        if (patients.size() == 0) {
            importDefaultPatients();
        }
        return patients;
    }

    private static void importDefaultPatients() {

    patients.add(new Patient("Dorota", "Miler", new Date(31-08-2003), new Address("Hery 18/28","Gdansk",80299,"503456987")));
    patients.add(new Patient("Monika", "Stefanska", new Date(19-10-1984), new Address("Piekarnicza 18/28","Gdynia",80880,"501221800")));
    patients.add(new Patient("Tomek", "KOwalski", new Date(24-02-1999), new Address("Jagiellonska 13/1","Gdansk",80345,"512333699")));
    }

    public static boolean contains(User user) {
        List<Patient> patients = getAllPatients();
        for (Patient userFromList : patients) {
            if (userFromList.getId() == user.getId()) {
                return true;
            }
        }
        return false;
    }
}