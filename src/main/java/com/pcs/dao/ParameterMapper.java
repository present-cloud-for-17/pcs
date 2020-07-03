package com.pcs.dao;

import java.util.List;

import com.pcs.pojo.Parameter;

public interface ParameterMapper {
    int deleteByPrimaryKey(Integer paId);

    int insert(Parameter record);

    int insertSelective(Parameter record);

    Parameter selectByPrimaryKey(Integer paId);

    int updateByPrimaryKeySelective(Parameter record);

    int updateByPrimaryKey(Parameter record);
    
    List<Parameter> findAll();

}