import java.util.List;

import controller.StudentController;
import controller.TeacherController;
import model.Student;
import model.Teacher;

public class Lesson4 {

    public static void main(String[] args) {

        // new StudentController()
        // .sendOnConsole(List.of(new Student(1, "Sasha", "Ivanov"),
        // new Student(1, "Ira", "Ivanova")));

        TeacherController teacherController = new TeacherController();
        teacherController.sendOnConsole(List.of(teacherController.createTeacher(1, "Maria", "Ivanovna"),
                teacherController.createTeacher(2, "Ivan", "Vovkovich")));

    }
}