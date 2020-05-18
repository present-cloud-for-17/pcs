package com.pcs.service;

import java.util.List;

import com.pcs.pojo.Permission;

public interface IPermissionService {
	int deleteByPrimaryKey(Integer pId);

	int insert(Permission record);

	int insertSelective(Permission record);

	Permission selectByPrimaryKey(Integer pId);

	int updateByPrimaryKeySelective(Permission record);

	int updateByPrimaryKey(Permission record);
	
    List<Permission> findAll();

}
