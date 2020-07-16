package com.ahf.dao;

import com.ahf.entity.Student;
import com.ahf.entity.Teacher;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/*
* dao层老师接口
* */
@CacheNamespace(blocking = true)
public interface ITeacherMapper {
    /*
    *根据ID查询记录
    */
    @Select(value = {"select * from teacher"})
    @Results(id = "teacherMap",value = {
            @Result(id = true,property = "tId",column = "t_id"),
            @Result(property = "tName",column = "t_name"),
            @Result(property = "tAge",column = "t_age"),
            @Result(property = "tSex",column = "t_sex"),
            @Result(property = "students",column = "t_id",many =
            @Many(select = "com.ahf.dao.ITeacherMapper.findStudentsByTid",fetchType = FetchType.EAGER))
    })
    List<Teacher> findAll();
    @Select(value = {"select * from student where s_id in(select ts_sid from teacher_student where ts_tid = #{ts_tid})"})
    @Results(value = {
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
    List<Student> findStudentsByTid();
}