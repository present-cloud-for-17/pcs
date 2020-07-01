package com.pcs.dao;

import java.util.List;

import com.pcs.pojo.Role;

public interface RoleMapper {
	int deleteByPrimaryKey(Integer rId);

	int insert(Role record);

	int insertSelective(Role record);

	Role selectByPrimaryKey(Integer rId);

	int updateByPrimaryKeySelective(Role record);

	int updateByPrimaryKey(Role record);

	List<Role> findAll();

	List<Role> selectRolePermission();

}