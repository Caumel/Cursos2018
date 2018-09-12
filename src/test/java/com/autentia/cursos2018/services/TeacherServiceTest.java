package com.autentia.cursos2018.services;

import com.autentia.cursos2018.mappers.TeacherMapper;
import com.autentia.cursos2018.model.Teacher;
import com.autentia.cursos2018.services.impl.TeacherServiceImpl;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TeacherServiceTest {

    private TeacherMapper teacherMapper = mock(TeacherMapper.class); //Crear un mock
    private TeacherService sut = new TeacherServiceImpl(teacherMapper);

    @Test
    public void getAll() {
        List list = mock(List.class);   //Se crea un mock de una lista para compararla con el real
        doReturn(list).when(teacherMapper).getAll();

        List<Teacher> teachers = sut.getAll();

        verify(teacherMapper).getAll();  //Mirar si se ha llamado a getall
        assertThat(teachers, equalTo(list));
    }

    @Test
    public void getTeacher() {
        Teacher teachermock = mock(Teacher.class);
        doReturn(teachermock).when(teacherMapper).getTeacher(1);

        Teacher teacher = sut.getTeacher(1 );

        verify(teacherMapper).getTeacher(1);
        assertThat(teacher, equalTo(teachermock));
    }

    @Test
    public void insertTeacher() {
        Teacher teacher = new Teacher(1,"Paco Pruebas");
        sut.insertTeacher(teacher);

        verify(teacherMapper).insertTeacher(teacher);
    }
}