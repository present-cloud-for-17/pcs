package com.pcs.dao;

import java.util.List;

import com.pcs.pojo.Person;

public interface PersonMapper {
	int deleteByPrimaryKey(Integer peId);

	int insert(Person record);

	int insertSelective(Person record);

	Person selectByPrimaryKey(Integer peId);

	int updateByPrimaryKeySelective(Person record);

	int updateByPrimaryKey(Person record);

	List<Person> findAll();
}