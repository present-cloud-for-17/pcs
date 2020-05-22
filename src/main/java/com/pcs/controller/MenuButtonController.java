package com.pcs.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcs.pojo.MenuButton;
import com.pcs.service.IMenuButtonService;

@Controller
@RequestMapping("/menuButton")
public class MenuButtonController {
	@Resource
	private IMenuButtonService menuButtonService;

	/**
	 * 获取单个菜单按钮信息
	 * 
	 * @param mbId
	 * @return
	 */
	@RequestMapping(value = "/selectByPrimaryKey.do", method = { RequestMethod.GET })
	public @ResponseBody MenuButton selectByPrimaryKey(@RequestBody Integer mbId) {
		return this.menuButtonService.selectByPrimaryKey(mbId);
	}

	/**
	 * 删除单个菜单按钮信息
	 * 
	 * @param mbId
	 * @return
	 */
	@RequestMapping(value = "/deleteByPrimaryKey.do", method = { RequestMethod.GET })
	public @ResponseBody Integer deleteByPrimaryKey(@RequestBody Integer mbId) {
		return this.menuButtonService.deleteByPrimaryKey(mbId);
	}

	/**
	 * 修改单个菜单按钮信息
	 * 
	 * @param menuButton
	 * @return
	 */
	@RequestMapping(value = "/updateByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer updateByPrimaryKeySelective(@RequestBody MenuButton menuButton) {
		return this.menuButtonService.updateByPrimaryKeySelective(menuButton);
	}

	/**
	 * 添加单个菜单按钮信息
	 * 
	 * @param menuButton
	 * @return
	 */
	@RequestMapping(value = "/insert.do", method = { RequestMethod.POST })
	public @ResponseBody Integer insertSelective(@RequestBody MenuButton menuButton) {
		return this.menuButtonService.insertSelective(menuButton);
	}

	/**
	 * 查找全部菜单按钮信息
	 */
	@RequestMapping("/findAll.do")
	public @ResponseBody List<MenuButton> findAll() {
		return this.menuButtonService.findAll();
	}
}