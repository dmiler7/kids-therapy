package pl.dorotamiler.kidstherapy.domain;

import java.util.Date;

public class Patient extends User {

    private Address address;

    public Patient(String name, String lastName, Date birthDate, Address address) {
        super(name, lastName, birthDate);
        this.address = address;
    }

    public Patient(String pesel) {
        super(pesel);
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Patient {" +
                "Name : " + this.getName() +
                ", Last name : " + this.getName() +
                ", Date : " + this.getBirthDate() +
                ", PESEL : " + this.getPesel() +
                "Address : " + this.address +
                '}';
    }
}