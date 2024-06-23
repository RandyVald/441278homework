package controller;

import java.util.List;

import model.Teacher;
import model.User;
import service.StudentService;
import service.TeacherService;
import view.UserView;
import view.TeacherView;

public class TeacherController implements UserController{

    private  UserView<Teacher> view = new TeacherView(); 
    private TeacherService teacherService = new TeacherService();   

    @Override
    public <T extends User> User create(T user) {
        return user;
    }

    public void sendOnConsole(List<Teacher> teachers){
        view.sendOnConsole(teachers);
         
    }

    public Teacher createTeacher(int id, String name, String lastName){
        
        return teacherService.createTeacher(id, name, lastName);

    }

    public void renameTeacher(Teacher teacher, String name){
        teacherService.renameTeacher(teacher, name);
    }





}