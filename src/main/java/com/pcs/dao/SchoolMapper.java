package com.pcs.dao;

import java.util.List;

import com.pcs.pojo.School;

public interface SchoolMapper {
	int deleteByPrimaryKey(Integer sId);

	int insert(School record);

	int insertSelective(School record);

	School selectByPrimaryKey(Integer sId);

	int updateByPrimaryKeySelective(School record);

	int updateByPrimaryKey(School record);

	List<School> findAll();

}