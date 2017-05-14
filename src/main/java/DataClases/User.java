package DataClases;

import java.util.Date;

/**
 * Created by Ian on 13/5/2017.
 */
public abstract class User {
    private String email;
    private String userName;
    private String firstName;
    private String firstLastName;
    private String secondLastName;
    private Date birthDate;
    private String password;
    private boolean isEnabled;

    public User(String userName, String firstName, String firstLastName, String secondLastName, String email, String password, Date birthDate, boolean isEnabled){
        this.email = email;
        this.userName = userName;
        this.firstName = firstName;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.birthDate = birthDate;
        this.password = password;
        this.isEnabled = isEnabled;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getPassword() {
        return password;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
