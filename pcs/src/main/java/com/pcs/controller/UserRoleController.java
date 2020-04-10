package com.pcs.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pcs.pojo.UserRole;
import com.pcs.service.IUserRoleService;

@Controller
@RequestMapping("/userRole")
public class UserRoleController {
	@Resource
	private IUserRoleService userRoleService;

	@RequestMapping("/selectByPrimaryKey")
	public String toIndex(HttpServletRequest request, Model model) {
		int urId = Integer.parseInt(request.getParameter("urid"));
		UserRole userRole = this.userRoleService.selectByPrimaryKey(urId);
		model.addAttribute("userRole", userRole);
		return "showRserRole";
	}
}