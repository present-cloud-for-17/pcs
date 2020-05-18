package com.pcs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pcs.dao.SchoolMapper;
import com.pcs.pojo.School;
import com.pcs.service.ISchoolService;

@Service("schoolService")
public class SchoolServiceImpl implements ISchoolService {
	@Resource
	private SchoolMapper schoolDao;

	@Override
	public int deleteByPrimaryKey(Integer sId) {
		// TODO Auto-generated method stub
		return this.schoolDao.deleteByPrimaryKey(sId);
	}

	@Override
	public int insert(School record) {
		// TODO Auto-generated method stub
		return this.schoolDao.insert(record);

	}

	@Override
	public int insertSelective(School record) {
		// TODO Auto-generated method stub
		return this.schoolDao.insertSelective(record);

	}

	@Override
	public School selectByPrimaryKey(Integer sId) {
		// TODO Auto-generated method stub
		return this.schoolDao.selectByPrimaryKey(sId);

	}

	@Override
	public int updateByPrimaryKeySelective(School record) {
		// TODO Auto-generated method stub
		return this.schoolDao.updateByPrimaryKeySelective(record);

	};

	@Override
	public int updateByPrimaryKey(School record) {
		// TODO Auto-generated method stub
		return this.schoolDao.updateByPrimaryKey(record);

	}

	@Override
	public List<School> findAll() {
		// TODO Auto-generated method stub
		return this.schoolDao.findAll();
	}

}
