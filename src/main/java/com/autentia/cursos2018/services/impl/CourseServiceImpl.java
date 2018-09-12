package com.autentia.cursos2018.services.impl;

import com.autentia.cursos2018.mappers.CourseMapper;
import com.autentia.cursos2018.model.Course;
import com.autentia.cursos2018.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private CourseMapper courseMapper;

    @Autowired
    public CourseServiceImpl(CourseMapper courseMapper){this.courseMapper = courseMapper;}


    @Override
    public List<Course> getAll() {
        return courseMapper.getAll();
    }

    @Override
    public Course getCourse(int id){
        return courseMapper.getCourse(id);
    }

    @Override
    public boolean insertCourse(Course course) {
        return courseMapper.insertCourse(course);
    }
}
