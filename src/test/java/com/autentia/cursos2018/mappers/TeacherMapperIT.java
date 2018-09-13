package com.autentia.cursos2018.mappers;

import com.autentia.cursos2018.model.Teacher;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
public class TeacherMapperIT {

    @Autowired
    private TeacherMapper sut;

    @Test
    public void whenInsertACourseThisHasToBeInsertedInDDBB() {
        Teacher teacherToInsert = new Teacher();
        teacherToInsert.setName("Paco Pruebas");

        sut.insertTeacher(teacherToInsert);

        List<Teacher> profesores = sut.getAll();
        assertTrue(profesores.stream().anyMatch(course -> "Paco Pruebas".equals(course.getName())));
    }

    @Test
    public void whenReadATeacherThisTeacherHaveToBeTheOneThatIAsk() {
        Teacher modelTeacher = new Teacher(1,"Roberto Canales");

        Teacher teacherToRead = sut.getTeacher(1);

        assertThat(teacherToRead, equalTo(modelTeacher));
    }

    @Test
    public void whenIAskedForAllTheTeacherIHaveToReceiveAllTheTeacher() {
        List<Teacher> allTeacher = new ArrayList<>();
        allTeacher.add(new Teacher(1,"Roberto Canales"));
        allTeacher.add(new Teacher(2, "Ruben Aguilera"));

        List<Teacher> teachers = sut.getAll();

        assertEquals(allTeacher,teachers);
    }
}
