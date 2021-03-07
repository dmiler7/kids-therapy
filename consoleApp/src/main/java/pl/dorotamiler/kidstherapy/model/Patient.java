package pl.dorotamiler.kidstherapy.model;

import java.util.Date;
import java.util.Objects;

public class Patient extends User {

    private Address address;

    public Patient(String name, String lastName, Date date, Address address) {
        super(name, lastName, date);
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
                ", Date : " + this.getDate() +
                ", PESEL : " + this.getPesel() +
                "Address : " + this.address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Patient patient = (Patient) o;
        return Objects.equals(address, patient.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), address);
    }
}