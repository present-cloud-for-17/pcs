package com.pcs.service;

import com.pcs.pojo.MenuButton;

public interface IMenuButtonService {
	int deleteByPrimaryKey(Integer mbId);

	int insert(MenuButton record);

	int insertSelective(MenuButton record);

	MenuButton selectByPrimaryKey(Integer mbId);

	int updateByPrimaryKeySelective(MenuButton record);

	int updateByPrimaryKey(MenuButton record);
}
