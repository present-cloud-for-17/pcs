package com.pcs.dao;

import java.util.List;

import com.pcs.pojo.Course;

public interface CourseMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
    
	List<Course> findAll();

}