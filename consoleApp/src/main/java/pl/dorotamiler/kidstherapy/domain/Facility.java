package pl.dorotamiler.kidstherapy.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Facility {

    private int id;
    private String name;
    private Address address;
    private Boolean isNfz;
    private List<Specialist> specialists = new ArrayList<>();
    private List<Therapy> typeOfTherapies = new ArrayList<>();

    private Facility(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.address = builder.address;
        this.isNfz = builder.isNfz;
        this.specialists = builder.specialists;
        this.typeOfTherapies = builder.typeOfTherapies;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Boolean getNfz() {
        return isNfz;
    }

    public List<Specialist> getSpecialists() {
        return specialists;
    }

    public List<Therapy> getTypeOfTherapies() {
        return typeOfTherapies;
    }

    @Override
    public String toString() {
        return "Facility id : " +
                +this.id +
                ", Name : '" + this.name +
                ", Address : " + this.address.toString() +
                ", has Nfz : " + this.isNfz +
                ", Specialists : " + this.specialists +
                ", Type of offered therapies : " + this.typeOfTherapies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return id == facility.id
                && Objects.equals(name, facility.name)
                && Objects.equals(address, facility.address)
                && Objects.equals(isNfz, facility.isNfz)
                && Objects.equals(specialists, facility.specialists)
                && Objects.equals(typeOfTherapies, facility.typeOfTherapies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, isNfz, specialists, typeOfTherapies);
    }

    public static class Builder {
        private int id;
        private String name;
        private Address address;
        private Boolean isNfz;
        private List<Specialist> specialists = new ArrayList<>();
        private List<Therapy> typeOfTherapies = new ArrayList<>();

        public Builder(int id, String name, Address address) {
            if (id < 0) {
                throw new IllegalArgumentException("Id number must be >= 0.");
            }
            if (name == null || "".equals(name)) {
                throw new IllegalArgumentException("Facility's name must not be empty.");
            }
            if (address == null || "".equals(name)) {
                throw new IllegalArgumentException("Facility's address must not be empty.");
            }
            this.id = id;
            this.name = name;
            this.address = address;
        }

        public Builder isFacilityNfz(Boolean isNfz) {
            this.isNfz = isNfz;
            return this;
        }

        public Builder withSpecialists(List<Specialist> specialists) {
            this.specialists = specialists;
            return this;
        }

        public Builder withTherapies(List<Therapy> typeOfTherapie) {
            this.typeOfTherapies = typeOfTherapie;
            return this;
        }
        
        public Facility build(){
            return new Facility(this);
        }
    }
}