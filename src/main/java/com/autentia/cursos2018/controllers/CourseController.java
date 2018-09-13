package com.autentia.cursos2018.controllers;


import com.autentia.cursos2018.model.Course;
import com.autentia.cursos2018.services.impl.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    CourseServiceImpl courseService;

    // GET all
    @GetMapping("/")
    public List<Course> getAll() {
        return courseService.getAll();
    }
    // Post
    @PostMapping("/")
    public Course insertCourse(@RequestBody Course course){
        courseService.insertCourse(course);
        return course;
    }

    //Get One
    @GetMapping("/{id}")
    public Course getCourse(@PathVariable int id){
        return courseService.getCourse(id);
    }

}
