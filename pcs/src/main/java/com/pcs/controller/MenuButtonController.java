package com.pcs.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pcs.pojo.MenuButton;
import com.pcs.service.IMenuButtonService;

@Controller
@RequestMapping("/menuButton")
public class MenuButtonController {
	@Resource
	private IMenuButtonService menuButtonService;

	@RequestMapping("/selectByPrimaryKey")
	public String toIndex(HttpServletRequest request, Model model) {
		int mbId = Integer.parseInt(request.getParameter("mbid"));
		MenuButton menuButton = this.menuButtonService.selectByPrimaryKey(mbId);
		model.addAttribute("menuButton", menuButton);
		return "showMenuButton";
	}
}