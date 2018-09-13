package com.autentia.cursos2018.controllers;

import com.autentia.cursos2018.mappers.TeacherMapper;
import com.autentia.cursos2018.model.Teacher;
import com.autentia.cursos2018.services.TeacherService;
import com.autentia.cursos2018.services.impl.TeacherServiceImpl;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TeacherControllerTest {

    private TeacherServiceImpl teacherServiceImpl = mock(TeacherServiceImpl.class); //Crear un mock
    private TeacherController sut = new TeacherController(teacherServiceImpl);

    @Test
    public void ifIWantAllTheTeacherThisMethodHaveToCallGetAll() {
        List list = mock(List.class);   //Se crea un mock de una lista para compararla con el real
        doReturn(list).when(teacherServiceImpl).getAll();

        List<Teacher> teachers = sut.getAll();

        verify(teacherServiceImpl).getAll();  //Mirar si se ha llamado a getall
        assertThat(teachers, equalTo(list));
    }

    @Test
    public void ifIWantOneTeacherThisMethodHaveToCallGetTeacher() {
        Teacher teachermock = mock(Teacher.class);
        doReturn(teachermock).when(teacherServiceImpl).getTeacher(1);

        Teacher teacher = sut.getTeacher(1 );

        verify(teacherServiceImpl).getTeacher(1);
        assertThat(teacher, equalTo(teachermock));
    }

    @Test
    public void ifIWantToInsertATeacherThisMethodHaveToCallInsertTeacher() {
        Teacher teacher = new Teacher(1,"Paco Pruebas");
        sut.insertTeacher(teacher);

        verify(teacherServiceImpl).insertTeacher(teacher);
    }
}
