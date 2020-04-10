package com.pcs.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pcs.pojo.Menu;
import com.pcs.service.IMenuService;

@Controller
@RequestMapping("/menu")
public class MenuController {
	@Resource
	private IMenuService menuService;

	@RequestMapping("/selectByPrimaryKey")
	public String toIndex(HttpServletRequest request, Model model) {
		int mId = Integer.parseInt(request.getParameter("mid"));
		Menu menu = this.menuService.selectByPrimaryKey(mId);
		model.addAttribute("menu", menu);
		return "showMenu";
	}
}