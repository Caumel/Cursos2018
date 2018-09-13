package com.autentia.cursos2018.controllers;


import com.autentia.cursos2018.mappers.CourseMapper;
import com.autentia.cursos2018.model.Course;
import com.autentia.cursos2018.services.CourseService;
import com.autentia.cursos2018.services.impl.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private CourseServiceImpl courseServiceImpl;

    @Autowired
    public CourseController(CourseServiceImpl courseServiceImpl){this.courseServiceImpl = courseServiceImpl;}

    // GET all
    @GetMapping("/")
    public List<Course> getAll() {
        return courseServiceImpl.getAll();
    }
    // Post
    @PostMapping("/")
    public Course insertCourse(@RequestBody Course course){
        courseServiceImpl.insertCourse(course);
        return course;
    }

    //Get One
    @GetMapping("/{id}")
    public Course getCourse(@PathVariable int id){
        return courseServiceImpl.getCourse(id);
    }

}
