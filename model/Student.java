package OOP.Lessen5.model;

public class Student extends User{
    protected int studentID;


    public Student(String firstName, String lastName, String midlName, int studentID) {
        super(firstName, lastName, midlName);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", MidlName='" + MidlName + '\'' +
                '}';
    }
}
