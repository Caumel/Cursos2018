package com.autentia.cursos2018.mappers;

import com.autentia.cursos2018.model.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

import static org.hamcrest.CoreMatchers.equalTo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
public class CourseMapperIT {

    @Autowired
    private CourseMapper sut;

    @Test
    public void whenInsertACourseThisHasToBeInsertedInDDBB() {
        Course courseToInsert = new Course();
        courseToInsert.setTitle("test");

        sut.insertCourse(courseToInsert);

        List<Course> cursos = sut.getAll();
        assertTrue(cursos.stream().anyMatch(course -> "test".equals(course.getTitle())));
    }

    @Test
    public void whenReadACourseThisCourseHaveToBeTheOneThatIAsk() {
        Course modelCourse = new Course(1,true,1,"TDD",5,1);

        Course courseToRead = sut.getCourse(1);

        assertThat(courseToRead, equalTo(modelCourse));
    }

    @Test
    public void WhenIAskedForAllTheCoursesIHaveToReceiveAllTheCourses() {
        List<Course> allCourses = new ArrayList<>();
        allCourses.add(new Course(1,true,1,"TDD",5,1));
        allCourses.add(new Course(2, true, 2,"Angular 1", 5, 1));
        allCourses.add(new Course(3,true,2,"Angular 2",5,1));

        List<Course> courses = sut.getAll();

        assertEquals(allCourses,courses);
    }
}