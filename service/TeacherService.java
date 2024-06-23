package service;

import model.Teacher;

public class TeacherService {
 
    public Teacher createTeacher(int id, String name, String lastName) {
        return new Teacher(id, name, lastName);
    }

    public void renameTeacher(Teacher teacher, String name) {
        teacher.setName(name);
    }
    
}
