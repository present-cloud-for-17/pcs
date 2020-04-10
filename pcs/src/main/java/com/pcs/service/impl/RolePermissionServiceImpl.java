package com.pcs.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pcs.dao.RolePermissionMapper;
import com.pcs.pojo.RolePermission;
import com.pcs.service.IRolePermissionService;

@Service("rolePermissionService")
public class RolePermissionServiceImpl implements IRolePermissionService {
	@Resource
	private RolePermissionMapper rolePermissionDao;

	@Override
	public int deleteByPrimaryKey(Integer rpId) {
		// TODO Auto-generated method stub
		return this.rolePermissionDao.deleteByPrimaryKey(rpId);
	}

	@Override
	public int insert(RolePermission record) {
		// TODO Auto-generated method stub
		return this.rolePermissionDao.insert(record);

	}

	@Override
	public int insertSelective(RolePermission record) {
		// TODO Auto-generated method stub
		return this.rolePermissionDao.insertSelective(record);

	}

	@Override
	public RolePermission selectByPrimaryKey(Integer rpId) {
		// TODO Auto-generated method stub
		return this.rolePermissionDao.selectByPrimaryKey(rpId);

	}

	@Override
	public int updateByPrimaryKeySelective(RolePermission record) {
		// TODO Auto-generated method stub
		return this.rolePermissionDao.updateByPrimaryKeySelective(record);

	}

	@Override
	public int updateByPrimaryKey(RolePermission record) {
		// TODO Auto-generated method stub
		return this.rolePermissionDao.updateByPrimaryKey(record);

	}

}
