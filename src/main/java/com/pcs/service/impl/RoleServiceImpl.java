package com.pcs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pcs.dao.RoleMapper;
import com.pcs.pojo.Role;
import com.pcs.service.IRoleService;

@Service("roleService")
public class RoleServiceImpl implements IRoleService {
	@Resource
	private RoleMapper roleDao;

	@Override
	public int deleteByPrimaryKey(Integer uId) {
		// TODO Auto-generated method stub
		return this.roleDao.deleteByPrimaryKey(uId);
	}

	@Override
	public int insert(Role record) {
		// TODO Auto-generated method stub
		return this.roleDao.insert(record);

	}

	@Override
	public int insertSelective(Role record) {
		// TODO Auto-generated method stub
		return this.roleDao.insertSelective(record);

	}

	@Override
	public Role selectByPrimaryKey(Integer uId) {
		// TODO Auto-generated method stub
		return this.roleDao.selectByPrimaryKey(uId);

	}

	@Override
	public int updateByPrimaryKeySelective(Role record) {
		// TODO Auto-generated method stub
		return this.roleDao.updateByPrimaryKeySelective(record);

	}

	@Override
	public int updateByPrimaryKey(Role record) {
		// TODO Auto-generated method stub
		return this.roleDao.updateByPrimaryKey(record);

	}

	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return this.roleDao.findAll();
	}

	@Override
	public List<Role> selectRolePermission() {
		// TODO Auto-generated method stub
		return this.roleDao.selectRolePermission();
	}

}
