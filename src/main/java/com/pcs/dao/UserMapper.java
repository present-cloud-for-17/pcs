package com.pcs.dao;

import java.util.List;

import com.pcs.pojo.User;

public interface UserMapper {
	int deleteByPrimaryKey(Integer uId);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer uId);

	User selectByuNumber(String uNumber);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	List<User> findAll();


}