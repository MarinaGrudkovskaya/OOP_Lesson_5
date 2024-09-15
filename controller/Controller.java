package OOP.Lessen5.controller;

import OOP.Lessen5.model.Student;
import OOP.Lessen5.model.Teacher;
import OOP.Lessen5.model.Type;
import OOP.Lessen5.model.User;
import OOP.Lessen5.service.DataService;
import OOP.Lessen5.service.StudentGroupService;
import OOP.Lessen5.view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final DataService service = new DataService();// поле класса Контроллер
    private final StudentGroupService studentGroupService = new StudentGroupService();

    private final StudentView view = new StudentView();// поле класса контроллер
    // Метод создания студента
    public void createStudent(String firstName, String lastName, String midlName){
        service.create(firstName,lastName,midlName, Type.STUDENT);
    }

    public void getAllStudent(){
        List<User> userList = service.getAllUsers();
        for (User user: userList){
//            System.out.println(user.toString());
            Student student =(Student) user;
            view.PrintOnConsole(student);
        }
    }

    //Создать метод в Контроллере, в котором формируется учебная группа, путем вызова метода из сервиса
    public void createStudentGroup(Teacher teacher, List<User> students){
        studentGroupService.createStudentGroup(teacher, students);
    }
    //  Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id)
    //  и преподавателя (его id) и формирования учебной группы, путём вызова метода из сервиса;
    public void getAllListGroup(StudentGroupService studentGroupService){
        service.getAllUsers();
    }
}
