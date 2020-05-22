package com.pcs.dao;

import java.util.List;

import com.pcs.pojo.UserRole;

public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer urId);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Integer urId);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
    
	List<UserRole> findAll();

}