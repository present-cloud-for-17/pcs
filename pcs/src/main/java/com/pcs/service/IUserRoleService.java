package com.pcs.service;

import com.pcs.pojo.UserRole;

public interface IUserRoleService {
	int deleteByPrimaryKey(Integer urId);

	int insert(UserRole record);

	int insertSelective(UserRole record);

	UserRole selectByPrimaryKey(Integer urId);

	int updateByPrimaryKeySelective(UserRole record);

	int updateByPrimaryKey(UserRole record);
}
