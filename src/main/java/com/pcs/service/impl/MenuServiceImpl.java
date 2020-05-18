package com.pcs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pcs.dao.MenuMapper;
import com.pcs.pojo.Menu;
import com.pcs.service.IMenuService;

@Service("menuService")
public class MenuServiceImpl implements IMenuService {
	@Resource
	private MenuMapper menuDao;

	@Override
	public int deleteByPrimaryKey(Integer mId) {
		// TODO Auto-generated method stub
		return this.menuDao.deleteByPrimaryKey(mId);
	}

	@Override
	public int insert(Menu record) {
		// TODO Auto-generated method stub
		return this.menuDao.insert(record);

	}

	@Override
	public int insertSelective(Menu record) {
		// TODO Auto-generated method stub
		return this.menuDao.insertSelective(record);

	}

	@Override
	public Menu selectByPrimaryKey(Integer mId) {
		// TODO Auto-generated method stub
		return this.menuDao.selectByPrimaryKey(mId);

	}

	@Override
	public int updateByPrimaryKeySelective(Menu record) {
		// TODO Auto-generated method stub
		return this.menuDao.updateByPrimaryKeySelective(record);

	}

	@Override
	public int updateByPrimaryKey(Menu record) {
		// TODO Auto-generated method stub
		return this.menuDao.updateByPrimaryKey(record);

	}

	@Override
	public List<Menu> findAll() {
		// TODO Auto-generated method stub
		return this.menuDao.findAll();
	}

}
