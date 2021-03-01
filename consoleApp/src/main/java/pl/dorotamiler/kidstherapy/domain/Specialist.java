package pl.dorotamiler.kidstherapy.domain;

import java.util.List;

public class Specialist {

    private String name;
    private String lastName;
    private Facility facility;
    private List<Therapy> typeOfOfferedTherapy;


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Facility getFacility() {
        return facility;
    }

    public List<Therapy> getTypeOfOfferedTherapy() {
        return typeOfOfferedTherapy;
    }
}
