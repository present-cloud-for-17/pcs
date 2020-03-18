package com.pcs.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pcs.dao.UserMapper;
import com.pcs.pojo.User;
import com.pcs.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private UserMapper userDao;

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
