package pl.dorotamiler.kidstherapy.domain;

import java.util.List;

public class Patients {

    private List<Patient> patients;
    private String filePath;

    public List<Patient> getPatients() {
        return patients;
    }

    public String getFilePath() {
        return filePath;
    }
}
