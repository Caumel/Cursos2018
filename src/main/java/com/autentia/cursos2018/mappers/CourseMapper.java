package com.autentia.cursos2018.mappers;

import com.autentia.cursos2018.model.Course;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CourseMapper {

    @Insert("INSERT into courses(active,idTeacher,title,hours,level) VALUES(#{active}, #{idTeacher}, #{title}, #{hours}, #{level})")
    Boolean insertCourse(Course course);

    @Select("SELECT id, active,idTeacher,title,hours,level from courses WHERE id = #{id}")
    Course getCourse(int id);


    @Select("SELECT id, active,idTeacher,title,hours,level from courses WHERE active=TRUE")
    List<Course> getAll();

    @Delete("DELETE FROM courses WHERE id=#{id}")
    void deleteCourse(int id);

}
