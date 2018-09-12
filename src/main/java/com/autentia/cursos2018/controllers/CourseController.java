package com.autentia.cursos2018.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {

    // GET all
    @GetMapping("/hola")
    public String holaMundo(){
        return "hola";
    }
    // Nuevo curso
}
