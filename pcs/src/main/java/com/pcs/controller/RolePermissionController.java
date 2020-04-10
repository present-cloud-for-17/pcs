package com.pcs.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pcs.pojo.RolePermission;
import com.pcs.service.IRolePermissionService;

@Controller
@RequestMapping("/rolePermission")
public class RolePermissionController {
	@Resource
	private IRolePermissionService rolePermissionService;

	@RequestMapping("/selectByPrimaryKey")
	public String toIndex(HttpServletRequest request, Model model) {
		int rId = Integer.parseInt(request.getParameter("rid"));
		RolePermission rolePermission = this.rolePermissionService.selectByPrimaryKey(rId);
		model.addAttribute("rolePermission", rolePermission);
		return "showRolePermission";
	}
}