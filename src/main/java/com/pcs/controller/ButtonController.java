package com.pcs.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	 * @param button
	 * @return
	 */
	@RequestMapping(value = "/selectByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Button selectByPrimaryKey(@RequestBody Button button) {
		return this.buttonService.selectByPrimaryKey(button.getbId());
	}

	/**
	 * 删除单个按钮信息
	 * 
	 * @param button
	 * @return
	 */
	@RequestMapping(value = "/deleteByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer deleteByPrimaryKey(@RequestBody Button button) {
		return this.buttonService.deleteByPrimaryKey(button.getbId());
	}

	/**
	 * 修改单个按钮信息
	 * 
	 * @param button
	 * @return
	 */
	@RequestMapping(value = "/updateByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer updateByPrimaryKeySelective(@RequestBody Button button) {
		return this.buttonService.updateByPrimaryKeySelective(button);
	}

	/**
	 * 添加单个按钮信息
	 * 
	 * @param button
	 * @return
	 */
	@RequestMapping(value = "/insert.do", method = { RequestMethod.POST })
	public @ResponseBody Integer insertSelective(@RequestBody Button Button) {
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