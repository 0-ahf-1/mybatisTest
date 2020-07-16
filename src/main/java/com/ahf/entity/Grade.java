package com.ahf.entity;

import java.io.Serializable;

public class Grade implements Serializable {
    private Integer gId;
    private String gGrade;

    public Grade() {
    }

    public Grade(Integer gId, String gGrade) {
        this.gId = gId;
        this.gGrade = gGrade;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getgGrade() {
        return gGrade;
    }

    public void setgGrade(String gGrade) {
        this.gGrade = gGrade;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gId=" + gId +
                ", gGrade='" + gGrade + '\'' +
                '}';
    }
}
