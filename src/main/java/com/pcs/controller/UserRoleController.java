package com.pcs.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcs.pojo.UserRole;
import com.pcs.service.IUserRoleService;

@Controller
@RequestMapping("/userRole")
public class UserRoleController {
	@Resource
	private IUserRoleService userRoleService;

	/**
	 * 获取单个用户角色信息
	 * 
	 * @param userRole
	 * @return
	 */
	@RequestMapping(value = "/selectByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody UserRole selectByPrimaryKey(@RequestBody UserRole userRole) {
		return this.userRoleService.selectByPrimaryKey(userRole.getUrId());
	}

	/**
	 * 删除单个用户角色信息
	 * 
	 * @param userRole
	 * @return
	 */
	@RequestMapping(value = "/deleteByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer deleteByPrimaryKey(@RequestBody UserRole userRole) {
		return this.userRoleService.deleteByPrimaryKey(userRole.getUrId());
	}

	/**
	 * 修改单个用户角色信息
	 * 
	 * @param userRole
	 * @return
	 */
	@RequestMapping(value = "/updateByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer updateByPrimaryKeySelective(@RequestBody UserRole userRole) {
		return this.userRoleService.updateByPrimaryKeySelective(userRole);
	}

	/**
	 * 添加单个用户角色信息
	 * 
	 * @param userRole
	 * @return
	 */
	@RequestMapping(value = "/insertuserRole.do", method = { RequestMethod.POST })
	public @ResponseBody Integer insertSelective(@RequestBody UserRole userRole) {
		return this.userRoleService.insertSelective(userRole);
	}

	/**
	 * 查找全部用户角色信息
	 */
	@RequestMapping("/insert.do")
	public @ResponseBody List<UserRole> findAll() {
		return this.userRoleService.findAll();
	}
}