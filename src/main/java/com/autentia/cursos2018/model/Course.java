package com.autentia.cursos2018.model;

import java.util.Objects;

public class Course {

    private int id;
    private Boolean active;
    private int idTeacher;
    private String title;
    private int hours;
    private String level;

    public Course(int id,Boolean active,int idTeacher, String title , int hours,String level){
        this.id = id;
        this.active = active;
        this.idTeacher = idTeacher;
        this.title = title;
        this.hours = hours;
        this.level = level;
    }
    public Course(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id == course.id &&
                idTeacher == course.idTeacher &&
                hours == course.hours &&
                Objects.equals(level, course.level) &&
                Objects.equals(active, course.active) &&
                Objects.equals(title, course.title);
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", active=" + active +
                ", idTeacher=" + idTeacher +
                ", title='" + title + '\'' +
                ", hours=" + hours +
                ", level=" + level +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, active, idTeacher, title, hours, level);
    }
}
