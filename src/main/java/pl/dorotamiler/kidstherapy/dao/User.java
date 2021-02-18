package pl.dorotamiler.kidstherapy.dao;

import java.util.Date;
import java.util.Objects;

public abstract class User {

    private String name;
    private String lastName;
    private Date date;
    private String pesel;

    public User(){
    this.name="";
    this.lastName="";
    this.date=new Date();
    this.pesel="";
    }

    public User(String pesel){
        this.pesel=pesel;
    }

    public User(String name, String lastName, Date date){
        this.name = name;
        this.lastName=lastName;
        this.date=date;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", date=").append(date);
        sb.append(", pesel='").append(pesel).append('\'');
        sb.append('}');
        return sb.toString();
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

