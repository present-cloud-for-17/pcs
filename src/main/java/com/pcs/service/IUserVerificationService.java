package com.pcs.service;

import com.pcs.pojo.UserVerification;

public interface IUserVerificationService {
	int deleteByPrimaryKey(Integer uvId);

	int insert(UserVerification record);

	int insertSelective(UserVerification record);

	UserVerification selectByPrimaryKey(Integer uvId);

	int updateByPrimaryKeySelective(UserVerification record);

	int updateByPrimaryKey(UserVerification record);

	UserVerification login(UserVerification record);
}
