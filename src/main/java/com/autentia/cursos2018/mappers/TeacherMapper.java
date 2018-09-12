package com.autentia.cursos2018.mappers;

import com.autentia.cursos2018.model.Course;
import com.autentia.cursos2018.model.Teacher;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TeacherMapper {

    @Insert("INSERT into teachers(name) VALUES(#{name})")
    Boolean insertTeacher(Teacher teacher);

    @Select("SELECT id, name from teachers WHERE id = #{id}")
    Teacher getTeacher(int id);

    @Select("SELECT id, name from teachers")
    List<Teacher> getAll();
}
