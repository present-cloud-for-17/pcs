package com.pcs.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pcs.pojo.Button;
import com.pcs.service.IButtonService;

@Controller
@RequestMapping("/button")
public class ButtonController {
	@Resource
	private IButtonService buttonService;

	@RequestMapping("/selectByPrimaryKey")
	public String toIndex(HttpServletRequest request, Model model) {
		int bId = Integer.parseInt(request.getParameter("bid"));
		Button button = this.buttonService.selectByPrimaryKey(bId);
		model.addAttribute("button", button);
		return "showUser";
	}
}