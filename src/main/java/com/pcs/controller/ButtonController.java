package com.pcs.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcs.pojo.Button;
import com.pcs.service.IButtonService;

@Controller
@RequestMapping("/button")
public class ButtonController {
	@Resource
	private IButtonService buttonService;

	/**
	 * 获取单个按钮信息
	 * 
	 * @param bId
	 * @return
	 */
	@RequestMapping(value = "/selectByPrimaryKey.do", method = { RequestMethod.GET })
	public @ResponseBody Button selectByPrimaryKey(@RequestParam Integer bId) {
		return this.buttonService.selectByPrimaryKey(bId);
	}

	/**
	 * 删除单个按钮信息
	 * 
	 * @param bId
	 * @return
	 */
	@RequestMapping(value = "/deleteByPrimaryKey.do", method = { RequestMethod.GET })
	public @ResponseBody Integer deleteByPrimaryKey(@RequestParam Integer bId) {
		return this.buttonService.deleteByPrimaryKey(bId);
	}

	/**
	 * 修改单个按钮信息
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/updateByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer updateByPrimaryKeySelective(@RequestParam Button Button) {
		return this.buttonService.updateByPrimaryKeySelective(Button);
	}

	/**
	 * 添加单个按钮信息
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/insert.do", method = { RequestMethod.POST })
	public @ResponseBody Integer insertSelective(@RequestParam Button Button) {
		return this.buttonService.insertSelective(Button);
	}

	/**
	 * 查找全部按钮信息
	 */
	@RequestMapping("/findAll.do")
	public @ResponseBody List<Button> findAll() {
		return this.buttonService.findAll();
	}
}