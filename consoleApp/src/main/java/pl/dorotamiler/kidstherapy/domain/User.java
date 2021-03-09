package pl.dorotamiler.kidstherapy.domain;

import java.util.Date;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

public abstract class User extends Role{

    private Long id;
    private String name;
    private String lastName;
    private Date birthDate;
    private Pesel pesel;
    private Role role;
    private String login;
    private String password;
    private static String ADMIN_PASSWORD = "giru7Sf4@a";
    private static String ADMIN_LOGIN = "Admin";


    User() {
        throw new IllegalArgumentException("Login and password are mandatory to be provided when creating an user.");
    }

    public User(String login) {
        throw new IllegalArgumentException("Login and password are mandatory to be provided when creating an user.");
    }

//    public User() {
//        this.name = "";
//        this.lastName = "";
//        this.date = new Date();
//        this.pesel = "";
//    }

    public User(String ADMIN_LOGIN, String ADMIN_PASSWORD, Role adminRole) {
        if (ADMIN_LOGIN == null || "".equals(ADMIN_LOGIN) || ADMIN_LOGIN.length() != 11) {
            throw new IllegalArgumentException("Admin login must consist of agreed combination of letters/digits. Any other isnot accepted!");
        }
        if (ADMIN_PASSWORD == null || "".equals(ADMIN_PASSWORD) || ADMIN_PASSWORD.length() != 11) {
            throw new IllegalArgumentException("Admin login must consist of agreed combination of letters/digits. Any other isnot accepted!");
        }
        this.ADMIN_LOGIN = ADMIN_LOGIN;
        this.ADMIN_PASSWORD = ADMIN_PASSWORD;
        this.adminRole=adminRole;
        System.out.println("Admin! Welcome to admin mode :)");
    }

    public User(Pesel pesel) {
        if (pesel == null || "".equals(pesel) || StringUtils.isEmpty(pesel.toString()) || pesel.toString().length() != 11) {
            throw new IllegalArgumentException("Pesel number must not be empty, of null value " +
                    "and number of given digits " +
                    "must equal 11");
        }
        this.pesel = pesel;
    }

    public User(String login, String password) {
        if (login == null || "".equals(login) || StringUtils.isEmpty(login)) {
            throw new IllegalArgumentException("Login must not be empty.");
        }

        if (password == null || "".equals(password)) {
            throw new IllegalArgumentException("Last name must not be empty.");
        }

        this.login = login;
        this.password = password;
        this.birthDate = birthDate;
    }

    public User(String name, String lastName, Date birthDate) {
        if (name == null || "".equals(name)) {
            throw new IllegalArgumentException("Name must not be empty.");
        }

        if (lastName == null || "".equals(lastName)) {
            throw new IllegalArgumentException("Last name must not be empty.");
        }

        if (birthDate == null) {
            throw new IllegalArgumentException("Date of birth must not be empty.");
        }

        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    User(Long id) {
        if (id < 0) {
            throw new IllegalArgumentException("Id must be a number >= 0. ")
        }
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPesel(Pesel pesel) {
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLogin() {
        return login;
    }

    public Pesel getPesel() {
        return pesel;
    }

    public Role getRole() {
        return role;
    }

    public static String getAdminLogin() {
        return ADMIN_LOGIN;
    }

    public Long getId() {
        return id;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public static String getAdminPassword() {
        return ADMIN_PASSWORD;
    }

    //    @Override
//    public String toString() {
//        return "User {" +
//                "Name : " + this.name +
//                ", Last name : " + this.lastName +
//                ", Date : " + this.date +
//                ", PESEL : " + this.pesel +
//                ", id : " + this.id +
//                ", login='" + this.login +
//                '}';
//    }
}