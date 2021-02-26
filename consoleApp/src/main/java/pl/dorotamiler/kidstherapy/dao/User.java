package pl.dorotamiler.kidstherapy.dao;

import java.util.Date;
import java.util.Objects;

public abstract class User {

    private String name;
    private String lastName;
    private Date date;
    private String pesel;

    public User() {
        this.name = "";
        this.lastName = "";
        this.date = new Date();
        this.pesel = "";
    }

    public User(String pesel) {
        if (pesel == null || "".equals(pesel) || pesel.length() != 11) {
            throw new IllegalArgumentException("pesel " +
                    "cannot be empty, of null value " +
                    "and number of given digits " +
                    "must equal 11");
        }
        this.pesel = pesel;
    }

    public User(String name, String lastName, Date date) {
        this.name = name;
        this.lastName = lastName;
        this.date = date;
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

    public String getPesel() {
        return pesel;
    }

    @Override
    public String toString() {
        return "User {" +
                "Name : " + this.name +
                ", Last name : " + this.lastName +
                ", Date : " + this.date +
                ", PESEL : " + this.pesel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(lastName, user.lastName) && Objects.equals(date, user.date) && Objects.equals(pesel, user.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, date, pesel);
    }
}