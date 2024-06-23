package controller;

import java.util.List;

import model.Student;
import model.User;
import view.UserView;
import view.StudentView;

public class StudentController implements UserController {

    private UserView<Student> view = new StudentView();

    @Override
    public <T extends User> User create(T user) {
        return user;
    }

    public void sendOnConsole(List<Student> students) {
        view.sendOnConsole(students);
    }

}
