package com.autentia.cursos2018.controllers;

import com.autentia.cursos2018.mappers.TeacherMapper;
import com.autentia.cursos2018.model.Teacher;
import com.autentia.cursos2018.services.TeacherService;
import com.autentia.cursos2018.services.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/teachers")
public class TeacherController {

    private TeacherServiceImpl teacherServiceImpl;

    @Autowired
    public TeacherController(TeacherServiceImpl teacherServiceImpl){this.teacherServiceImpl = teacherServiceImpl;}

    // GET all
    @GetMapping("/")
    public List<Teacher> getAll() {
        return teacherServiceImpl.getAll();
    }
    // Post
    @PostMapping("/")
    public Teacher insertTeacher(@RequestBody Teacher teacher){
        teacherServiceImpl.insertTeacher(teacher);
        return teacher;
    }

    //Get One
    @GetMapping("/{id}")
    public Teacher getTeacher(@PathVariable int id){
        return teacherServiceImpl.getTeacher(id);
    }

}