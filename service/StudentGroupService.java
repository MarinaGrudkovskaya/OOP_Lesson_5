package OOP.Lessen5.service;

import OOP.A_Lessen_3.Student;
import OOP.Lessen5.model.Teacher;
import OOP.Lessen5.model.User;

import java.util.List;

public class StudentGroupService {
    private List<User> userList; //храним список пользователей

    public List<User> createStudentGroup(Teacher teacher, List<User> students){
        userList.add(teacher);
        userList.addAll(students);
        return userList;
    }
}
