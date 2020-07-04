package com.pcs.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcs.pojo.RolePermission;
import com.pcs.service.IRolePermissionService;

@Controller
@RequestMapping("/rolePermission")
public class RolePermissionController {
	@Resource
	private IRolePermissionService rolePermissionService;

	/**
	 * 获取单个角色权限信息
	 * 
	 * @param rolePermission
	 * @return
	 */
	@RequestMapping(value = "/selectByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody RolePermission selectByPrimaryKey(@RequestBody RolePermission rolePermission) {
		return this.rolePermissionService.selectByPrimaryKey(rolePermission.getrId());
	}

	/**
	 * 删除单个角色权限信息
	 * 
	 * @param rolePermission
	 * @return
	 */
	@RequestMapping(value = "/deleteByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer deleteByPrimaryKey(@RequestBody RolePermission rolePermission) {
		return this.rolePermissionService.deleteByPrimaryKey(rolePermission.getRpId());
	}

	/**
	 * 根据rId和pId修改单个角色权限信息
	 * 
	 * @param rolePermission
	 * @return
	 */
	@RequestMapping(value = "/updateByrIdAndpId.do", method = { RequestMethod.POST })
	public @ResponseBody Integer updateByrIdAndpId(@RequestBody RolePermission rolePermission) {
		return this.rolePermissionService.updateByrIdAndpId(rolePermission);
	}

	/**
	 * 修改单个角色权限信息
	 * 
	 * @param rolePermission
	 * @return
	 */
	@RequestMapping(value = "/updateByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer updateByPrimaryKeySelective(@RequestBody RolePermission rolePermission) {
		return this.rolePermissionService.updateByPrimaryKeySelective(rolePermission);
	}

	/**
	 * 添加单个角色权限信息
	 * 
	 * @param rolePermission
	 * @return
	 */
	@RequestMapping(value = "/insert.do", method = { RequestMethod.POST })
	public @ResponseBody Integer insertSelective(@RequestBody RolePermission rolePermission) {
		return this.rolePermissionService.insertSelective(rolePermission);
	}

	/**
	 * 查找全部角色权限信息
	 */
	@RequestMapping("/findAll.do")
	public @ResponseBody List<RolePermission> findAll() {
		return this.rolePermissionService.findAll();
	}
}