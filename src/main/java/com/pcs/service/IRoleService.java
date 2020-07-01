package com.pcs.service;

import java.util.List;

import com.pcs.pojo.Role;

public interface IRoleService {
	int deleteByPrimaryKey(Integer rId);

	int insert(Role record);

	int insertSelective(Role record);

	Role selectByPrimaryKey(Integer rId);

	int updateByPrimaryKeySelective(Role record);

	int updateByPrimaryKey(Role record);

	List<Role> findAll();

	List<Role> selectRolePermission();

}
