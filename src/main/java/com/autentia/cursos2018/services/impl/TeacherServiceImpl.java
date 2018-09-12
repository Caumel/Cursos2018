package com.autentia.cursos2018.services.impl;

import com.autentia.cursos2018.mappers.TeacherMapper;
import com.autentia.cursos2018.model.Teacher;
import com.autentia.cursos2018.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    private TeacherMapper teacherMapper;

    @Autowired
    public TeacherServiceImpl(TeacherMapper teacherMapper){this.teacherMapper = teacherMapper;}


    @Override
    public List<Teacher> getAll() {
        return teacherMapper.getAll();
    }

    @Override
    public Teacher getTeacher(int id){
        return teacherMapper.getTeacher(id);
    }

    @Override
    public boolean insertTeacher(Teacher teacher) {
        return teacherMapper.insertTeacher(teacher);
    }
}
