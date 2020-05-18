package com.pcs.service;

import java.util.List;

import com.pcs.pojo.Menu;

public interface IMenuService {
	int deleteByPrimaryKey(Integer mId);

	int insert(Menu record);

	int insertSelective(Menu record);

	Menu selectByPrimaryKey(Integer mId);

	int updateByPrimaryKeySelective(Menu record);

	int updateByPrimaryKey(Menu record);
	
    List<Menu> findAll();

}
