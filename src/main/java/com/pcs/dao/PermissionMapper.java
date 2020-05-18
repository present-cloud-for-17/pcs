package com.pcs.dao;

import java.util.List;

import com.pcs.pojo.Permission;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer pId);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer pId);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
    
    List<Permission> findAll();

}