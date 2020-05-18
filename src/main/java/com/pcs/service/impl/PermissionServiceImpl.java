package com.pcs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pcs.dao.PermissionMapper;
import com.pcs.pojo.Permission;
import com.pcs.service.IPermissionService;

@Service("permissionService")
public class PermissionServiceImpl implements IPermissionService {
	@Resource
	private PermissionMapper permissionDao;

	@Override
	public int deleteByPrimaryKey(Integer pId) {
		// TODO Auto-generated method stub
		return this.permissionDao.deleteByPrimaryKey(pId);
	}

	@Override
	public int insert(Permission record) {
		// TODO Auto-generated method stub
		return this.permissionDao.insert(record);

	}

	@Override
	public int insertSelective(Permission record) {
		// TODO Auto-generated method stub
		return this.permissionDao.insertSelective(record);

	}

	@Override
	public Permission selectByPrimaryKey(Integer pId) {
		// TODO Auto-generated method stub
		return this.permissionDao.selectByPrimaryKey(pId);

	}

	@Override
	public int updateByPrimaryKeySelective(Permission record) {
		// TODO Auto-generated method stub
		return this.permissionDao.updateByPrimaryKeySelective(record);

	}

	@Override
	public int updateByPrimaryKey(Permission record) {
		// TODO Auto-generated method stub
		return this.permissionDao.updateByPrimaryKey(record);

	}

	@Override
	public List<Permission> findAll() {
		// TODO Auto-generated method stub
		return this.permissionDao.findAll();
	}

}
