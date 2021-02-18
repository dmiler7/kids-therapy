package pl.dorotamiler.kidstherapy.dao;

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
}
