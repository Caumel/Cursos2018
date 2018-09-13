package com.autentia.cursos2018.controllers;

import com.autentia.cursos2018.model.Teacher;
import com.autentia.cursos2018.services.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    TeacherServiceImpl teacherService;

    // GET all
    @GetMapping("/")
    public List<Teacher> getAll() {
        return teacherService.getAll();
    }
    // Post
    @PostMapping("/")
    public Teacher insertTeacher(@RequestBody Teacher teacher){
        teacherService.insertTeacher(teacher);
        return teacher;
    }

    //Get One
    @GetMapping("/{id}")
    public Teacher getTeacher(@PathVariable int id){
        return teacherService.getTeacher(id);
    }

}