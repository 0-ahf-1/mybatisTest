package com.ahf.entity;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable {
    private Integer sId;
    private String sName;
    private Integer sAge;
    private String sSex;
    private Integer sGradeId;
    private List<Course> sCourses;

    private List<Teacher> teachers;
    private Grade grade;

    public Student() {
    }

    public Student(Integer sId, String sName, Integer sAge, String sSex, Integer sGradeId, List<Course> sCourses, List<Teacher> teachers, Grade grade) {
        this.sId = sId;
        this.sName = sName;
        this.sAge = sAge;
        this.sSex = sSex;
        this.sGradeId = sGradeId;
        this.sCourses = sCourses;
        this.teachers = teachers;
        this.grade = grade;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Integer getsAge() {
        return sAge;
    }

    public void setsAge(Integer sAge) {
        this.sAge = sAge;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    public Integer getsGradeId() {
        return sGradeId;
    }

    public void setsGradeId(Integer sGradeId) {
        this.sGradeId = sGradeId;
    }

    public List<Course> getCourses() {
        return sCourses;
    }

    public void setCourses(List<Course> sCourses) {
        this.sCourses = sCourses;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sAge=" + sAge +
                ", sSex='" + sSex + '\'' +
                ", sGradeId=" + sGradeId +
                ", sCourses=" + sCourses +
                ", teachers=" + teachers +
                ", grade=" + grade +
                '}';
    }
}
