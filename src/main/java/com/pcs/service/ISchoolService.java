package com.pcs.service;

import java.util.List;

import com.pcs.pojo.School;

public interface ISchoolService {
	int deleteByPrimaryKey(Integer sId);

	int insert(School record);

	int insertSelective(School record);

	School selectByPrimaryKey(Integer sId);

	int updateByPrimaryKeySelective(School record);

	int updateByPrimaryKey(School record);

	List<School> findAll();
}
