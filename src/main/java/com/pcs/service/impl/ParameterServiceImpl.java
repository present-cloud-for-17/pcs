package com.pcs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pcs.dao.ParameterMapper;
import com.pcs.pojo.Parameter;
import com.pcs.service.IParameterService;

@Service("parameterService")
public class ParameterServiceImpl implements IParameterService {
	@Resource
	private ParameterMapper parameterDao;

	@Override
	public int deleteByPrimaryKey(Integer dId) {
		// TODO Auto-generated method stub
		return this.parameterDao.deleteByPrimaryKey(dId);
	}

	@Override
	public int insert(Parameter record) {
		// TODO Auto-generated method stub
		return this.parameterDao.insert(record);

	}

	@Override
	public int insertSelective(Parameter record) {
		// TODO Auto-generated method stub
		return this.parameterDao.insertSelective(record);

	}

	@Override
	public Parameter selectByPrimaryKey(Integer dId) {
		// TODO Auto-generated method stub
		return this.parameterDao.selectByPrimaryKey(dId);

	}

	@Override
	public int updateByPrimaryKeySelective(Parameter record) {
		// TODO Auto-generated method stub
		return this.parameterDao.updateByPrimaryKeySelective(record);

	}

	@Override
	public int updateByPrimaryKey(Parameter record) {
		// TODO Auto-generated method stub
		return this.parameterDao.updateByPrimaryKey(record);

	}

	@Override
	public List<Parameter> findAll() {
		// TODO Auto-generated method stub
		return this.parameterDao.findAll();
	}

}
