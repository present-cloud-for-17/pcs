package com.pcs.dao;

import java.util.List;

import com.pcs.pojo.RolePermission;

public interface RolePermissionMapper {
	int deleteByPrimaryKey(Integer rpId);

	int insert(RolePermission record);

	int insertSelective(RolePermission record);

	RolePermission selectByPrimaryKey(Integer rpId);

	int updateByPrimaryKeySelective(RolePermission record);

	int updateByPrimaryKey(RolePermission record);

	List<RolePermission> findAll();

	Integer updateByrIdAndpId(RolePermission rolePermission);

}