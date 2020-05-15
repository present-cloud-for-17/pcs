package com.pcs.service;

import com.pcs.pojo.Dictionary;

public interface IDictionaryService {
	int deleteByPrimaryKey(Integer dId);

	int insert(Dictionary record);

	int insertSelective(Dictionary record);

	Dictionary selectByPrimaryKey(Integer dId);

	int updateByPrimaryKeySelective(Dictionary record);

	int updateByPrimaryKey(Dictionary record);
}
