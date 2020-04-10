package com.pcs.service;

import com.pcs.pojo.RolePermission;

public interface IRolePermissionService {
	int deleteByPrimaryKey(Integer rpId);

	int insert(RolePermission record);

	int insertSelective(RolePermission record);

	RolePermission selectByPrimaryKey(Integer rpId);

	int updateByPrimaryKeySelective(RolePermission record);

	int updateByPrimaryKey(RolePermission record);
}
