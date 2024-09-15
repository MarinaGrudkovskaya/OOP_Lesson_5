package OOP.Lessen5.service;

import OOP.Lessen5.model.Student;
import OOP.Lessen5.model.Teacher;
import OOP.Lessen5.model.Type;
import OOP.Lessen5.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> userList; //храним список пользователей

    // Метод создания User и добавление в список UserList
    public void create(String firstName, String lastName, String middleName, Type type) {
        int id = getFreeID(type);
        if(Type.STUDENT == type){
            Student student = new Student(firstName, lastName, middleName, id);
            userList.add(student);
        }
        if(Type.TEACHER == type){
            Teacher teacher = new Teacher(firstName, lastName, middleName, id);
            userList.add(teacher);
        }
    }
    // Метод чтения, который будет возвращать нам пользователя
    public User getUserById(Type type, int id){
        boolean itsStudent = Type.STUDENT == type;
        User currentUser = null;
        for (User user: userList){
            if(user instanceof Teacher && !itsStudent && ((Teacher)user).getTeacherId() ==id){
                currentUser = user;
            }
            if (user instanceof Student && itsStudent && ((Student)user).getStudentID() ==id){
                currentUser = user;
            }
        }
        return currentUser;
    }

    // Метод по возвращению полного списка пользователей
    public List<User> getAllUsers(){
        return userList;
    }

    // Возвращение всех студентов в сервисе
    private List<User> getAllSudent(){
        List<User> students = new ArrayList<>();
        for (User user: userList){
            if(user instanceof Student){
                students.add(user);
            }
        }
        return students;
    }

    //Mетод по проверки ID
    private int getFreeID(Type type){
        boolean itsStudent = Type.STUDENT == type;
        int lastId = 1;
        for (User user: userList){
            if(user instanceof Teacher && !itsStudent){
                lastId = ((Teacher)user).getTeacherId() + 1;
            }
            if (user instanceof Student && itsStudent){
                lastId = ((Student)user).getStudentID() + 1;
            }
        }
        return lastId;
    }

    public  void read(User user){

    }
}
