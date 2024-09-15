package OOP.Lessen5.model;

import java.time.LocalDate;

public abstract class User {
    protected String FirstName;
    protected String LastName;
    protected String MidlName;

    public User(String firstName, String lastName, String midlName) {
        FirstName = firstName;
        LastName = lastName;
        MidlName = midlName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getMidlName() {
        return MidlName;
    }

    public void setMidlName(String midlName) {
        MidlName = midlName;
    }

}
