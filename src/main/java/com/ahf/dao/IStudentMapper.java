package com.ahf.dao;

import com.ahf.entity.Student;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;
/*
* dao层学生接口
* */
@CacheNamespace(blocking = true)
public interface IStudentMapper {
    /*
    * 查询所有学生记录
    * */
    @Select(value = {"select * from student"})
    @Results(id = "studentMap",value = {
            @Result(id = true,property = "sId",column = "s_id"),
            @Result(property = "sName",column = "s_name"),
            @Result(property = "sAge",column = "s_age"),
            @Result(property = "sSex",column = "s_sex"),
            @Result(property = "sGradeId",column = "s_grade_id"),
            @Result(property = "sCourses",column = "s_id",many =
            @Many(select = "com.ahf.dao.ICourseMapper.findBySid",fetchType = FetchType.EAGER)),
            @Result(property = "grade",column = "s_grade_id",one =
            @One(select = "com.ahf.dao.IGradeMapper.findById"))
    })
    List<Student> findAll();

}
