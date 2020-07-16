package com.ahf.entity;

import java.io.Serializable;

public class Course implements Serializable {
    private Integer cId;
    private String cName;
    private Integer cSid;

    public Course() {
    }

    public Course(Integer cId, String cName, Integer cSid) {
        this.cId = cId;
        this.cName = cName;
        this.cSid = cSid;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Integer getcSid() {
        return cSid;
    }

    public void setcSid(Integer cSid) {
        this.cSid = cSid;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                ", cSid=" + cSid +
                '}';
    }
}
