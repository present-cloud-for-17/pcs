package com.pcs.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pcs.pojo.Permission;
import com.pcs.service.IPermissionService;

@Controller
@RequestMapping("/permission")
public class PermissionController {
	@Resource
	private IPermissionService permissionService;

	@RequestMapping("/selectByPrimaryKey")
	public String toIndex(HttpServletRequest request, Model model) {
		int pId = Integer.parseInt(request.getParameter("pid"));
		Permission permission = this.permissionService.selectByPrimaryKey(pId);
		model.addAttribute("permission", permission);
		return "showPermission";
	}
}