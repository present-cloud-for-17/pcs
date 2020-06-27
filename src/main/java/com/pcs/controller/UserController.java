package com.pcs.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcs.pojo.User;
import com.pcs.pojo.UserVerification;
import com.pcs.service.IUserService;
import com.pcs.service.IUserVerificationService;
import com.pcs.utils.MD5Encryption;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	@Resource
	private IUserVerificationService userVerificationService;

	/**
	 * 获取单个用戶信息
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/selectByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody User selectByPrimaryKey(@RequestBody User user) {
		return this.userService.selectByPrimaryKey(user.getuId());
	}

	/**
	 * 删除单个用戶信息
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/deleteByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer deleteByPrimaryKey(@RequestBody User user) {
		return this.userService.deleteByPrimaryKey(user.getuId());
	}

	/**
	 * 修改单个用戶信息
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/updateByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer updateByPrimaryKeySelective(@RequestBody User user) {
		return this.userService.updateByPrimaryKeySelective(user);
	}

	/**
	 * 添加单个用戶信息
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/insert.do", method = { RequestMethod.POST })
	public @ResponseBody Integer insertSelective(@RequestBody User user) {
		return this.userService.insertSelective(user);
	}

	/**
	 * 查找全部用戶信息
	 */
	@RequestMapping("/findAll.do")
	public @ResponseBody List<User> findAll() {
		return this.userService.findAll();
	}

	/**
	 * 用户注册
	 */
	@RequestMapping("/register.do")
	public @ResponseBody Integer register(@RequestBody User user) {
		// 添加注册用户信息
		Integer result = this.userService.insertSelective(user);
		if (result == 1) {
			// 根据注册用户的账号,手机号和邮箱注册登录表
			// 1 - 账号登录，2-手机号登录，3-邮箱登录
			UserVerification uv1 = new UserVerification(user.getuId(), 1, user.getuNumber(),
					MD5Encryption.createPassword("123456"), 1);
			UserVerification uv2 = new UserVerification(user.getuId(), 2, user.getPhone(),
					MD5Encryption.createPassword("123456"), 1);
			UserVerification uv3 = new UserVerification(user.getuId(), 3, user.getEmaile(),
					MD5Encryption.createPassword("123456"), 1);
			int uv1_res = this.userVerificationService.insertSelective(uv1);
			int uv2_res = this.userVerificationService.insertSelective(uv2);
			int uv3_res = this.userVerificationService.insertSelective(uv3);
			if (uv1_res == 1 && uv2_res == 1 && uv3_res == 1) {
				return 1;
			} else {
				return 0;
			}
		} else {
			return 0;
		}
	}

}