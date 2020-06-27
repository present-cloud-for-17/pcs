package com.pcs.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	 * 
	 * @param role
	 * @return
	 */
	@RequestMapping(value = "/selectByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Role selectByPrimaryKey(@RequestBody Role role) {
		return this.roleService.selectByPrimaryKey(role.getrId());
	}

	/**
	 * 删除单个角色信息
	 * 
	 * @param role
	 * @return
	 */
	@RequestMapping(value = "/deleteByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer deleteByPrimaryKey(@RequestBody Role role) {
		return this.roleService.deleteByPrimaryKey(role.getrId());
	}

	/**
	 * 修改单个角色信息
	 * 
	 * @param role
	 * @return
	 */
	@RequestMapping(value = "/updateByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer updateByPrimaryKeySelective(@RequestBody Role role) {
		return this.roleService.updateByPrimaryKeySelective(role);
	}

	/**
	 * 添加单个角色信息
	 * 
	 * @param role
	 * @return
	 */
	@RequestMapping(value = "/insert.do", method = { RequestMethod.POST })
	public @ResponseBody Integer insertSelective(@RequestBody Role role) {
		return this.roleService.insertSelective(role);
	}

	/**
	 * 查找全部角色信息
	 */
	@RequestMapping("/findAll.do")
	public @ResponseBody List<Role> findAll() {
		return this.roleService.findAll();
	}
}