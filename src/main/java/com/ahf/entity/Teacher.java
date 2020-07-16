package com.ahf.entity;

import java.io.Serializable;
import java.util.List;

public class Teacher implements Serializable {
    private Integer tId;
    private String tName;
    private Integer tAge;
    private String tSex;

    private List<Student> students;

    public Teacher() {
    }

    public Teacher(Integer tId, String tName, Integer tAge, String tSex, List<Student> students) {
        this.tId = tId;
        this.tName = tName;
        this.tAge = tAge;
        this.tSex = tSex;
        this.students = students;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public Integer gettAge() {
        return tAge;
    }

    public void settAge(Integer tAge) {
        this.tAge = tAge;
    }

    public String gettSex() {
        return tSex;
    }

    public void settSex(String tSex) {
        this.tSex = tSex;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tId=" + tId +
                ", tName='" + tName + '\'' +
                ", tAge=" + tAge +
                ", tSex='" + tSex + '\'' +
                ", students=" + students +
                '}';
    }
}
