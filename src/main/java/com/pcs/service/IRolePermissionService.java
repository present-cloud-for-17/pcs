package com.pcs.service;

import java.util.List;

import com.pcs.pojo.RolePermission;

public interface IRolePermissionService {
	int deleteByPrimaryKey(Integer rpId);

	int insert(RolePermission record);

	int insertSelective(RolePermission record);

	RolePermission selectByPrimaryKey(Integer rpId);

	int updateByPrimaryKeySelective(RolePermission record);

	int updateByPrimaryKey(RolePermission record);

	List<RolePermission> findAll();

	Integer updateByrIdAndpId(RolePermission rolePermission);

}
