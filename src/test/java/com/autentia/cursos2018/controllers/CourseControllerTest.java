package com.autentia.cursos2018.controllers;

import com.autentia.cursos2018.mappers.CourseMapper;
import com.autentia.cursos2018.model.Course;
import com.autentia.cursos2018.services.CourseService;
import com.autentia.cursos2018.services.impl.CourseServiceImpl;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CourseControllerTest {

    private CourseServiceImpl courseServiceImpl = mock(CourseServiceImpl.class); //Crear un mock
    private CourseController sut = new CourseController(courseServiceImpl);

    @Test
    public void ifIWantAllTheCoursesThisMethodHaveToCallGetAll() {
        List list = mock(List.class);   //Se crea un mock de una lista para compararla con el real
        doReturn(list).when(courseServiceImpl).getAll();

        List<Course> courses = sut.getAll();

        verify(courseServiceImpl).getAll();  //Mirar si se ha llamado a getall
        assertThat(courses, equalTo(list));
    }

    @Test
    public void ifIWantOneCourseThisMethodHaveToCallGetCourse() {
        Course coursemock = mock(Course.class);
        doReturn(coursemock).when(courseServiceImpl).getCourse(1);

        Course course = sut.getCourse(1 );

        verify(courseServiceImpl).getCourse(1);
        assertThat(course, equalTo(coursemock));
    }

    @Test
    public void ifIWantToInsertACourseThisMethodHaveToCallInsertCourse() {
        Course course = new Course(1,true,1,"TDD",5,"Básico");
        sut.insertCourse(course);

        verify(courseServiceImpl).insertCourse(course);
    }

    @Rollback
    @Test
    public void ifIWantToDeleteACourseThisMethodHaveToCallDeleteCourse() {
        sut.deleteCourse(1);

        verify(courseServiceImpl).deleteCourse(1);
    }
}
