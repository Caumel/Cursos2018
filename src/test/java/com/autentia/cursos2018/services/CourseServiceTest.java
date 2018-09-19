package com.autentia.cursos2018.services;

import com.autentia.cursos2018.mappers.CourseMapper;
import com.autentia.cursos2018.model.Course;
import com.autentia.cursos2018.services.impl.CourseServiceImpl;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CourseServiceTest {

    private CourseMapper courseMapper = mock(CourseMapper.class); //Crear un mock
    private CourseService sut = new CourseServiceImpl(courseMapper);

    @Test
    public void ifIWantAllTheCoursesThisMethodHaveToCallGetAll() {
        List list = mock(List.class);   //Se crea un mock de una lista para compararla con el real
        doReturn(list).when(courseMapper).getAll();

        List<Course> courses = sut.getAll();

        verify(courseMapper).getAll();  //Mirar si se ha llamado a getall
        assertThat(courses, equalTo(list));
    }

    @Test
    public void ifIWantOneCourseThisMethodHaveToCallGetCourse() {
        Course coursemock = mock(Course.class);
        doReturn(coursemock).when(courseMapper).getCourse(1);

        Course course = sut.getCourse(1 );

        verify(courseMapper).getCourse(1);
        assertThat(course, equalTo(coursemock));
    }

    @Test
    public void ifIWantToInsertACourseThisMethodHaveToCallInsertCourse() {
        Course course = new Course(1,true,1,"TDD",5,"Básico");
        sut.insertCourse(course);

        verify(courseMapper).insertCourse(course);
    }
}
