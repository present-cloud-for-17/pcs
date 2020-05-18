package com.pcs.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcs.pojo.UserVerification;
import com.pcs.service.IUserVerificationService;

@Controller
@RequestMapping("/userVerification")
public class UserVerificationController {
	@Resource
	private IUserVerificationService userVerificationService;

	/**
	 * 获取单个用户权限信息
	 * 
	 * @param uvId
	 * @return
	 */
	@RequestMapping(value = "/selectByPrimaryKey.do", method = { RequestMethod.GET })
	public @ResponseBody UserVerification selectByPrimaryKey(@RequestParam Integer uvId) {
		return this.userVerificationService.selectByPrimaryKey(uvId);
	}

	/**
	 * 删除单个用户权限信息
	 * 
	 * @param uvId
	 * @return
	 */
	@RequestMapping(value = "/deleteByPrimaryKey.do", method = { RequestMethod.GET })
	public @ResponseBody Integer deleteByPrimaryKey(@RequestParam Integer uvId) {
		return this.userVerificationService.deleteByPrimaryKey(uvId);
	}

	/**
	 * 修改单个用户权限信息
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/updateByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer updateByPrimaryKeySelective(@RequestParam UserVerification userVerification) {
		return this.userVerificationService.updateByPrimaryKeySelective(userVerification);
	}

	/**
	 * 添加单个用户权限信息
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/insert.do", method = { RequestMethod.POST })
	public @ResponseBody Integer insertSelective(@RequestParam UserVerification userVerification) {
		return this.userVerificationService.insertSelective(userVerification);
	}

	/**
	 * 查找全部用户权限信息
	 */
	@RequestMapping("/findAll.do")
	public @ResponseBody List<UserVerification> findAll() {
		return this.userVerificationService.findAll();
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