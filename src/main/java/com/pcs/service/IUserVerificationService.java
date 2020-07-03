package com.pcs.service;

import java.util.List;

import com.pcs.pojo.UserVerification;

public interface IUserVerificationService {
	int deleteByPrimaryKey(Integer uvId);

	int insert(UserVerification record);

	int insertSelective(UserVerification record);

	UserVerification selectByPrimaryKey(Integer uvId);

	int updateByPrimaryKeySelective(UserVerification record);

	int updateByuId(UserVerification record);

	int updateByPrimaryKey(UserVerification record);

	UserVerification login(UserVerification record);

	List<UserVerification> findAll();

	Integer deleteByuId(Integer uId);

	Integer updatePassword(UserVerification userVerification);

}
