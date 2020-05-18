package com.pcs.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcs.pojo.User;
import com.pcs.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;


	/**
     * 获取单个用戶信息
     * @param uId
     * @return
     */
    @RequestMapping(value = "/selectByPrimaryKey.do",method = {RequestMethod.GET})
    public @ResponseBody User selectByPrimaryKey(@RequestParam Integer uId){
        return  this.userService.selectByPrimaryKey(uId);
    }
    
    /**
     * 删除单个用戶信息
     * @param uId
     * @return
     */
    @RequestMapping(value = "/deleteByPrimaryKey.do",method = {RequestMethod.GET})
    public @ResponseBody Integer deleteByPrimaryKey(@RequestParam Integer uId){
        return  this.userService.deleteByPrimaryKey(uId);
    }
    
    /**
     * 修改单个用戶信息
     * @param user
     * @return
     */
    @RequestMapping(value = "/updateByPrimaryKey.do",method = {RequestMethod.POST})
    public @ResponseBody Integer updateByPrimaryKeySelective(@RequestParam User user){
        return  this.userService.updateByPrimaryKeySelective(user);
    }
    
    /**
     * 添加单个用戶信息
     * @param user
     * @return
     */
    @RequestMapping(value = "/insert.do",method = {RequestMethod.POST})
    public @ResponseBody Integer insertSelective(@RequestParam User user){
        return  this.userService.insertSelective(user);
    }
    
    /**
     * 查找全部用戶信息
     */
	@RequestMapping("/findAll.do")
    public @ResponseBody List<User> findAll() {
        return this.userService.findAll();
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