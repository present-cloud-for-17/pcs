package com.pcs.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcs.pojo.Role;
import com.pcs.service.IRoleService;

@Controller
@RequestMapping("/role")
public class RoleController {
	@Resource
	private IRoleService roleService;

	/**
     * 获取单个角色信息
     * @param rId
     * @return
     */
    @RequestMapping(value = "/selectByPrimaryKey.do",method = {RequestMethod.GET})
    public @ResponseBody Role selectByPrimaryKey(@RequestParam Integer rId){
        return  this.roleService.selectByPrimaryKey(rId);
    }
    
    /**
     * 删除单个角色信息
     * @param rId
     * @return
     */
    @RequestMapping(value = "/deleteByPrimaryKey.do",method = {RequestMethod.GET})
    public @ResponseBody Integer deleteByPrimaryKey(@RequestParam Integer rId){
        return  this.roleService.deleteByPrimaryKey(rId);
    }
    
    /**
     * 修改单个角色信息
     * @param role
     * @return
     */
    @RequestMapping(value = "/updateByPrimaryKey.do",method = {RequestMethod.POST})
    public @ResponseBody Integer updateByPrimaryKeySelective(@RequestParam Role role){
        return  this.roleService.updateByPrimaryKeySelective(role);
    }
    
    /**
     * 添加单个角色信息
     * @param role
     * @return
     */
    @RequestMapping(value = "/insertUser.do",method = {RequestMethod.POST})
    public @ResponseBody Integer insertSelective(@RequestParam Role role){
        return  this.roleService.insertSelective(role);
    }
    
    /**
     * 查找全部角色信息
     */
	@RequestMapping("/findAll.do")
    public @ResponseBody List<Role> findAll() {
        return this.roleService.findAll();
    }
}