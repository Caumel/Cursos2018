package com.autentia.cursos2018.services;

import com.autentia.cursos2018.model.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAll();
    Course getCourse(int id);
    boolean insertCourse(Course course);
    void deleteCourse(int id);
}
