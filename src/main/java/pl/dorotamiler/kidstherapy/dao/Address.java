package pl.dorotamiler.kidstherapy.dao;

import java.util.Objects;

public class Address {

    private String street;
    private String city;
    private Integer postalCode;
    private String phoneNumber;

    public Address() {
        this.street = "";
        this.city = "";
        this.postalCode = new Integer(0);
        this.phoneNumber = "";
    }

    public Address(String street, String city, Integer postalCode, String phoneNumber) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Address {" +
                "Street : " + this.street +
                ", City : " + this.city +
                ", Postal Code : " + this.postalCode +
                ", Phone Number : " + this.phoneNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(street, address.street) && Objects.equals(city, address.city) && Objects.equals(postalCode, address.postalCode) && Objects.equals(phoneNumber, address.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, postalCode, phoneNumber);
    }
}