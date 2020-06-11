package com.pcs.dao;

import java.util.List;

import com.pcs.pojo.SignIn;

public interface SignInMapper {
    int deleteByPrimaryKey(Integer siId);

    int insert(SignIn record);

    int insertSelective(SignIn record);

    SignIn selectByPrimaryKey(Integer siId);

    int updateByPrimaryKeySelective(SignIn record);

    int updateByPrimaryKey(SignIn record);
    
	List<SignIn> findAll();

}