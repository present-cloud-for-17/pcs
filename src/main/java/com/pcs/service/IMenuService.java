package com.pcs.service;

import com.pcs.pojo.Menu;

public interface IMenuService {
	int deleteByPrimaryKey(Integer mId);

	int insert(Menu record);

	int insertSelective(Menu record);

	Menu selectByPrimaryKey(Integer mId);

	int updateByPrimaryKeySelective(Menu record);

	int updateByPrimaryKey(Menu record);
}
