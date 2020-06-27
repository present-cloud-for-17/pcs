package com.pcs.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcs.pojo.SignIn;
import com.pcs.service.ISignInService;

@Controller
@RequestMapping("/signIn")
public class SignInController {
	@Resource
	private ISignInService signInService;

	/**
	 * 获取单个签到信息
	 * 
	 * @param signIn
	 * @return
	 */
	@RequestMapping(value = "/selectByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody SignIn selectByPrimaryKey(@RequestBody SignIn signIn) {
		return this.signInService.selectByPrimaryKey(signIn.getSiId());
	}

	/**
	 * 删除单个签到信息
	 * 
	 * @param signIn
	 * @return
	 */
	@RequestMapping(value = "/deleteByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer deleteByPrimaryKey(@RequestBody SignIn signIn) {
		return this.signInService.deleteByPrimaryKey(signIn.getSiId());
	}

	/**
	 * 修改单个签到信息
	 * 
	 * @param signIn
	 * @return
	 */
	@RequestMapping(value = "/updateByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer updateByPrimaryKeySelective(@RequestBody SignIn signIn) {
		return this.signInService.updateByPrimaryKeySelective(signIn);
	}

	/**
	 * 添加单个签到信息
	 * 
	 * @param signIn
	 * @return
	 */
	@RequestMapping(value = "/insert.do", method = { RequestMethod.POST })
	public @ResponseBody Integer insertSelective(@RequestBody SignIn signIn) {
		return this.signInService.insertSelective(signIn);
	}

	/**
	 * 查找全部签到信息
	 */
	@RequestMapping("/findAll.do")
	public @ResponseBody List<SignIn> findAll() {
		return this.signInService.findAll();
	}
}