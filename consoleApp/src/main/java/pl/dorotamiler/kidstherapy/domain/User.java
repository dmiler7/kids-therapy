package pl.dorotamiler.kidstherapy.domain;

import java.util.Date;
import java.util.Objects;

public abstract class User {

    private String name;
    private String lastName;
    private Date date;
    private String pesel;
    private Long id;
    private String login;
    private String password;

    public User() {
        this.name = "";
        this.lastName = "";
        this.date = new Date();
        this.pesel = "";
    }

    public User(String pesel) {
        if (pesel == null || "".equals(pesel) || pesel.length() != 11) {
            throw new IllegalArgumentException("Pesel number must not be empty, of null value " +
                    "or number of given digits " +
                    "must equal 11");
        }
        this.pesel = pesel;
    }

    public User(String name, String lastName, Date date) {
        if (name == null || "".equals(name)) {
            throw new IllegalArgumentException("Name must not be empty.");
        }

        if (lastName == null || "".equals(lastName)) {
            throw new IllegalArgumentException("Last name must not be empty.");
        }

        if (date == null || "".equals(date)) {
            throw new IllegalArgumentException("Date of birth must not be empty.");
        }

        this.name = name;
        this.lastName = lastName;
        this.date = date;
    }

    User(Long id) {
        if (id < 0) {
            throw new IllegalArgumentException("Id must be a number >= 0. ")
        }

        this.id = id;
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

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "User {" +
                "Name : " + this.name +
                ", Last name : " + this.lastName +
                ", Date : " + this.date +
                ", PESEL : " + this.pesel +
                ", id : " + this.id +
                ", login='" + this.login +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(lastName, user.lastName) && Objects.equals(date, user.date) && Objects.equals(pesel, user.pesel) && Objects.equals(id, user.id) && Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, date, pesel, id, login, password);
    }
}