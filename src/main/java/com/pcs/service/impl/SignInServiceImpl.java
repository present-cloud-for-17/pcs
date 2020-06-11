package com.pcs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pcs.dao.SignInMapper;
import com.pcs.pojo.SignIn;
import com.pcs.service.ISignInService;

@Service("signInService")
public class SignInServiceImpl implements ISignInService {
	@Resource
	private SignInMapper signInDao;

	@Override
	public int deleteByPrimaryKey(Integer siId) {
		// TODO Auto-generated method stub
		return this.signInDao.deleteByPrimaryKey(siId);
	}

	@Override
	public int insert(SignIn record) {
		// TODO Auto-generated method stub
		return this.signInDao.insert(record);

	}

	@Override
	public int insertSelective(SignIn record) {
		// TODO Auto-generated method stub
		return this.signInDao.insertSelective(record);

	}

	@Override
	public SignIn selectByPrimaryKey(Integer siId) {
		// TODO Auto-generated method stub
		return this.signInDao.selectByPrimaryKey(siId);

	}

	@Override
	public int updateByPrimaryKeySelective(SignIn record) {
		// TODO Auto-generated method stub
		return this.signInDao.updateByPrimaryKeySelective(record);

	};

	@Override
	public int updateByPrimaryKey(SignIn record) {
		// TODO Auto-generated method stub
		return this.signInDao.updateByPrimaryKey(record);

	}

	@Override
	public List<SignIn> findAll() {
		// TODO Auto-generated method stub
		return this.signInDao.findAll();
	}

}
