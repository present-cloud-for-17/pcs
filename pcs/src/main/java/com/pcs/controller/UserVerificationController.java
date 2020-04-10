package com.pcs.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pcs.pojo.UserVerification;
import com.pcs.service.IUserVerificationService;

@Controller
@RequestMapping("/userVerification")
public class UserVerificationController {
	@Resource
	private IUserVerificationService userVerificationService;

	@RequestMapping("/selectByPrimaryKey")
	public String toIndex(HttpServletRequest request, Model model) {
		int uvId = Integer.parseInt(request.getParameter("uvid"));
		UserVerification userVerification = this.userVerificationService.selectByPrimaryKey(uvId);
		model.addAttribute("userVerification", userVerification);
		return "showUserVerification";
	}
}