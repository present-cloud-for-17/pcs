package com.pcs.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcs.pojo.Permission;
import com.pcs.service.IPermissionService;

@Controller
@RequestMapping("/permission")
public class PermissionController {
	@Resource
	private IPermissionService permissionService;

	/**
	 * 获取单个权限信息
	 * 
	 * @param pId
	 * @return
	 */
	@RequestMapping(value = "/selectByPrimaryKey.do", method = { RequestMethod.GET })
	public @ResponseBody Permission selectByPrimaryKey(@RequestBody Integer pId) {
		return this.permissionService.selectByPrimaryKey(pId);
	}

	/**
	 * 删除单个权限信息
	 * 
	 * @param pId
	 * @return
	 */
	@RequestMapping(value = "/deleteByPrimaryKey.do", method = { RequestMethod.GET })
	public @ResponseBody Integer deleteByPrimaryKey(@RequestBody Integer pId) {
		return this.permissionService.deleteByPrimaryKey(pId);
	}

	/**
	 * 修改单个权限信息
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/updateByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer updateByPrimaryKeySelective(@RequestBody Permission permission) {
		return this.permissionService.updateByPrimaryKeySelective(permission);
	}

	/**
	 * 添加单个权限信息
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/insert.do", method = { RequestMethod.POST })
	public @ResponseBody Integer insertSelective(@RequestBody Permission permission) {
		return this.permissionService.insertSelective(permission);
	}

	/**
	 * 查找全部权限信息
	 */
	@RequestMapping("/findAll.do")
	public @ResponseBody List<Permission> findAll() {
		return this.permissionService.findAll();
	}
}