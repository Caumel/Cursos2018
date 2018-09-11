package com.autentia.cursos2018;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface CourseMapper {

    @Insert("INSERT into courses(active,teacher,title,hours,level) VALUES(#{active}, #{district}, #{title}, #{district}, #{active})")
    Boolean insertCourse(Course course);

    @Select("SELECT title, level, horas from courses WHERE id = #{id}")
    Course getCourse(int id);
}
