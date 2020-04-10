package com.pcs.dao;

import com.pcs.pojo.Dictionary;

public interface DictionaryMapper {
    int deleteByPrimaryKey(Integer dId);

    int insert(Dictionary record);

    int insertSelective(Dictionary record);

    Dictionary selectByPrimaryKey(Integer dId);

    int updateByPrimaryKeySelective(Dictionary record);

    int updateByPrimaryKey(Dictionary record);
}