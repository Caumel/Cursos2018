package com.autentia.cursos2018.mappers;

import com.autentia.cursos2018.model.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@TestPropertySource("classpath:application-test.properties")
@SpringBootTest
@Transactional
@Rollback
public class CourseMapperIT {

    @Autowired
    private CourseMapper sut;

    @Test
    public void whenInsertACourseThisHasToBeInsertedInDDBB() {
        Course courseToInsert = new Course(30,true,1,"test",5,"Básico");

        sut.insertCourse(courseToInsert);

        List<Course> cursos = sut.getAll();
        assertTrue(cursos.stream().anyMatch(course -> "test".equals(course.getTitle())));
    }

    @Test
    public void whenReadACourseThisCourseHaveToBeTheOneThatIAsk() {
        Course modelCourse = new Course(1,true,1,"TDD",5,"Básico");

        Course courseToRead = sut.getCourse(1);

        assertThat(courseToRead, equalTo(modelCourse));
    }

    @Test
    public void whenIAskedForAllTheCoursesIHaveToReceiveAllTheCourses() {
        List<Course> allCourses = new ArrayList<>();
        allCourses.add(new Course(1,true,1,"TDD",5,"Básico"));
        allCourses.add(new Course(2, true, 2,"Angular 1", 5, "Básico"));
        allCourses.add(new Course(3,true,2,"Angular 2",5,"Básico"));

        List<Course> courses = sut.getAll();

        assertEquals(allCourses,courses);
    }

    @Test
    public void whenITryToDeleteOneCourseItWillDelete() {
        sut.deleteCourse(1);

        List<Course> courses = sut.getAll();
        assertTrue(courses.stream().noneMatch(course -> course.getId() == 1));
    }
}