package com.autentia.cursos2018.services;

import com.autentia.cursos2018.model.Teacher;

import java.util.List;

public interface  TeacherService {
    List<Teacher> getAll();
    Teacher getTeacher(int id);
    boolean insertTeacher(Teacher teacher);
}
