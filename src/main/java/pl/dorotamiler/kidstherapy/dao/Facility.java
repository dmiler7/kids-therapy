package pl.dorotamiler.kidstherapy.dao;

import java.util.Objects;

public class Facility {

    private String name;
    private Address address;

    public Facility() {
        this.name = "";
        this.address = new Address();
    }

    public Facility(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Facility {" +
                "Name : " + this.name +
                ", Address : " + this.address.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return Objects.equals(name, facility.name) && Objects.equals(address, facility.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
}