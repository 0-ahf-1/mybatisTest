package com.ahf.dao;

import com.ahf.entity.Grade;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import org.apache.ibatis.annotations.Select;

import java.util.List;
/*
* dao层成绩接口
* */
public interface IGradeMapper {
    /*
    * 查询成绩表所有记录
    * */
    @Select(value = {"select * from grade"})
    List<Grade> findAll();
    /*
    * 根据ID查询成绩
    * */
    @Select(value = {"select * from grade where g_id = #{gId}"})
    Grade findById(Integer id);
}
