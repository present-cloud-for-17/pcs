package com.pcs.service;

import com.pcs.pojo.Button;

public interface IButtonService {
	int deleteByPrimaryKey(Integer bId);

	int insert(Button record);

	int insertSelective(Button record);

	Button selectByPrimaryKey(Integer bId);

	int updateByPrimaryKeySelective(Button record);

	int updateByPrimaryKey(Button record);
}
