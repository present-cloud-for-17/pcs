package com.pcs.dao;

import com.pcs.pojo.UserVerification;

public interface UserVerificationMapper {
    int deleteByPrimaryKey(Integer uvId);

    int insert(UserVerification record);

    int insertSelective(UserVerification record);

    UserVerification selectByPrimaryKey(Integer uvId);

    int updateByPrimaryKeySelective(UserVerification record);

    int updateByPrimaryKey(UserVerification record);
}