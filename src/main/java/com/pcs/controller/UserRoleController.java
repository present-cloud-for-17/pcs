package com.pcs.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	 * @param urId
	 * @return
	 */
	@RequestMapping(value = "/selectByPrimaryKey.do", method = { RequestMethod.GET })
	public @ResponseBody UserRole selectByPrimaryKey(@RequestParam Integer urId) {
		return this.userRoleService.selectByPrimaryKey(urId);
	}

	/**
	 * 删除单个用户角色信息
	 * 
	 * @param urId
	 * @return
	 */
	@RequestMapping(value = "/deleteByPrimaryKey.do", method = { RequestMethod.GET })
	public @ResponseBody Integer deleteByPrimaryKey(@RequestParam Integer urId) {
		return this.userRoleService.deleteByPrimaryKey(urId);
	}

	/**
	 * 修改单个用户角色信息
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/updateByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer updateByPrimaryKeySelective(@RequestParam UserRole userRole) {
		return this.userRoleService.updateByPrimaryKeySelective(userRole);
	}

	/**
	 * 添加单个用户角色信息
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/insertuserRole.do", method = { RequestMethod.POST })
	public @ResponseBody Integer insertSelective(@RequestParam UserRole userRole) {
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