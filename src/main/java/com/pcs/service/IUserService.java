package com.pcs.service;

import java.util.List;

import com.pcs.pojo.User;

public interface IUserService {
	int deleteByPrimaryKey(Integer uId);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer uId);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
	
    List<User> findAll();

}