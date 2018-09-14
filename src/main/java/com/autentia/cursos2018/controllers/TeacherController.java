package com.autentia.cursos2018.controllers;

import com.autentia.cursos2018.mappers.TeacherMapper;
import com.autentia.cursos2018.model.Teacher;
import com.autentia.cursos2018.services.TeacherService;
import com.autentia.cursos2018.services.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;



@RestController
@Path("/teachers")
public class TeacherController {

    private TeacherServiceImpl teacherServiceImpl;

    @Autowired
    public TeacherController(TeacherServiceImpl teacherServiceImpl){this.teacherServiceImpl = teacherServiceImpl;}


    // GET all
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Teacher> getAll() {
        return teacherServiceImpl.getAll();
    }

    // Post
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Teacher insertTeacher(@RequestBody Teacher teacher){
        teacherServiceImpl.insertTeacher(teacher);
        return teacher;
    }

    //Get One
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Teacher getTeacher(@PathParam("id") int id){
        return teacherServiceImpl.getTeacher(id);
    }

}