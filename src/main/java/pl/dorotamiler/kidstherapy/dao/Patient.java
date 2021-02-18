package pl.dorotamiler.kidstherapy.dao;

import java.util.Date;

public class Patient extends User {

    private Address address;

    public Patient(String name, String lastName, Date date, Address address) {
        super(name, lastName, date);
        this.address = address;
    }


}
