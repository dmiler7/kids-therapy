package pl.dorotamiler.kidstherapy.dao;

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
}
