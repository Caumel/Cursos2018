package com.autentia.cursos2018;


import java.util.ArrayList;
import java.util.Objects;

public class Course extends TransferObject {

    private Boolean active;
    private ArrayList<String> teacher;
    private String title;
    private int hours;
    private int level;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public ArrayList<String> getTeacher() {
        return teacher;
    }

    public void setTeacher(ArrayList<String> teacher) {
        this.teacher = teacher;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return hours == course.hours &&
                level == course.level &&
                Objects.equals(active, course.active) &&
                Objects.equals(teacher, course.teacher) &&
                Objects.equals(title, course.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(active, teacher, title, hours, level);
    }
}
