package pl.dorotamiler.kidstherapy.storage;

import pl.dorotamiler.kidstherapy.domain.Patient;
import pl.dorotamiler.kidstherapy.domain.User;

import java.util.ArrayList;
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

    patients.add(new Patient("84101902456"));
    patients.add(new Patient("Dori","jhbwSDI7"));
    patients.add(new Patient("84101902456"));

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
