package OOP.Lessen5.model;

public class Teacher extends User{
    private int TeacherId;

    public Teacher(String firstName, String lastName, String midlName, int teacherId) {
        super(firstName, lastName, midlName);
        TeacherId = teacherId;
    }

    public int getTeacherId() {
        return TeacherId;
    }

    public void setTeacherId(int teacherId) {
        TeacherId = teacherId;
    }
}
