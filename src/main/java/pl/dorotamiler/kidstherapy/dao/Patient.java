package pl.dorotamiler.kidstherapy.dao;

import java.util.Date;
import java.util.Objects;

public class Patient {

    private String name;
    private String lastName;
    private Date date;
    private String PESEL;
    private int age;

    public Patient(String name, String lastName){
        this.name = name;
        this.lastName=lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDate() {
        return date;
    }

    public String getPESEL() {
        return PESEL;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Patient{");
        sb.append("name='").append(name).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", date=").append(date);
        sb.append(", PESEL='").append(PESEL).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return age == patient.age
                && Objects.equals(name, patient.name)
                && Objects.equals(lastName, patient.lastName)
                && Objects.equals(date, patient.date)
                && Objects.equals(PESEL, patient.PESEL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, date, PESEL, age);
    }
}
