package com.pcs.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcs.pojo.UserVerification;
import com.pcs.service.IUserVerificationService;

@Controller
@RequestMapping("/userVerification")
public class UserVerificationController {
	@Resource
	private IUserVerificationService userVerificationService;

	@RequestMapping("/selectByPrimaryKey")
	public String selectByPrimaryKey(HttpServletRequest request, Model model) {
		int uvId = Integer.parseInt(request.getParameter("uvid"));
		UserVerification userVerification = this.userVerificationService.selectByPrimaryKey(uvId);
		model.addAttribute("userVerification", userVerification);
		return "showUserVerification";
	}

	@RequestMapping("/login")
	public @ResponseBody UserVerification login(HttpServletRequest request, Model model) {
		// 0 - 账号登录，1-手机号登录，2-邮箱登录
		int loginType = Integer.parseInt(request.getParameter("loginType")); // 登录类型
		String loginToken = request.getParameter("loginName"); // 登录名
		String passwordToken = request.getParameter("psd"); // 密码
		UserVerification userVerification = new UserVerification();
		userVerification.setLoginType(loginType);
		userVerification.setLoginToken(loginToken);
		userVerification.setPasswordToken(passwordToken);
		userVerification = this.userVerificationService.login(userVerification);
		return userVerification;
	}

}