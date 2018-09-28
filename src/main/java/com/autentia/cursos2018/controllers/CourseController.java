package com.autentia.cursos2018.controllers;


import com.autentia.cursos2018.model.Course;
import com.autentia.cursos2018.services.impl.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RestController
@Path("/courses")
public class CourseController {

    private CourseServiceImpl courseServiceImpl;

    @Autowired
    public CourseController(CourseServiceImpl courseServiceImpl){this.courseServiceImpl = courseServiceImpl;}

    // GET all
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Course> getAll() {
        return courseServiceImpl.getAll();
    }
    // Post
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Course insertCourse(@RequestBody Course course){
        courseServiceImpl.insertCourse(course);
        return course;
    }
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Course getCourse(@PathParam("id") int id){
        return courseServiceImpl.getCourse(id);
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteCourse(@PathParam("id") int id){
        courseServiceImpl.deleteCourse(id);
    }

}
