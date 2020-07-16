package com.ahf.dao;

import com.ahf.entity.Course;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ICourseMapper {
    @Select(value = {"select * from course where c_sid = #{cSid}"})
    List<Course> findBySid(Integer cSid);
}
