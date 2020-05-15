package com.pcs.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pcs.pojo.User;
import com.pcs.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;

	@RequestMapping("/selectByPrimaryKey")
	public String toIndex(HttpServletRequest request, Model model) {
		int uId = Integer.parseInt(request.getParameter("uid"));
		User user = this.userService.selectByPrimaryKey(uId);
		model.addAttribute("user", user);
		return "showUser";
	}
	//
	// @RequestMapping("/register")
	// public @ResponseBody Integer register(HttpServletRequest request, Model
	// model) {
	// // 0 - 账号登录，1-手机号登录，2-邮箱登录
	// int loginType = Integer.parseInt(request.getParameter("loginType")); // 登录类型
	// String loginToken = request.getParameter("loginName"); // 登录名
	// String passwordToken = request.getParameter("psd"); // 密码
	// Integer uId = Integer.parseInt(request.getParameter("uId"));
	// Integer uNumber = Integer.parseInt(request.getParameter("uNumber"));
	// String uName = request.getParameter("uName");
	// String phone = request.getParameter("phone");
	// String emaile = request.getParameter("emaile");
	// Date createDate = System.currentTimeMillis();
	// Integer status = 1;
	// User User = new User();
	// Integer result = this.userVerificationService.register(userVerification);
	// return result;
	// }
}