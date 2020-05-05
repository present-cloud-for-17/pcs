package com.pcs.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pcs.dao.UserVerificationMapper;
import com.pcs.pojo.UserVerification;
import com.pcs.service.IUserVerificationService;

@Service("userVerificationService")
public class UserVerificationServiceImpl implements IUserVerificationService {
	@Resource
	private UserVerificationMapper userVerificationDao;

	@Override
	public int deleteByPrimaryKey(Integer uvId) {
		// TODO Auto-generated method stub
		return this.userVerificationDao.deleteByPrimaryKey(uvId);
	}

	@Override
	public int insert(UserVerification record) {
		// TODO Auto-generated method stub
		return this.userVerificationDao.insert(record);

	}

	@Override
	public int insertSelective(UserVerification record) {
		// TODO Auto-generated method stub
		return this.userVerificationDao.insertSelective(record);

	}

	@Override
	public UserVerification selectByPrimaryKey(Integer uvId) {
		// TODO Auto-generated method stub
		return this.userVerificationDao.selectByPrimaryKey(uvId);

	}

	@Override
	public int updateByPrimaryKeySelective(UserVerification record) {
		// TODO Auto-generated method stub
		return this.userVerificationDao.updateByPrimaryKeySelective(record);

	}

	@Override
	public int updateByPrimaryKey(UserVerification record) {
		// TODO Auto-generated method stub
		return this.userVerificationDao.updateByPrimaryKey(record);

	}

	@Override
	public UserVerification login(UserVerification record) {
		// TODO Auto-generated method stub
		return this.userVerificationDao.login(record);
	}

}
