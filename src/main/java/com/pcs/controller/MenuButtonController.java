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
	 * @param menuButton
	 * @return
	 */
	@RequestMapping(value = "/selectByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody MenuButton selectByPrimaryKey(@RequestBody MenuButton menuButton) {
		return this.menuButtonService.selectByPrimaryKey(menuButton.getMbId());
	}

	/**
	 * 删除单个菜单按钮信息
	 * 
	 * @param menuButton
	 * @return
	 */
	@RequestMapping(value = "/deleteByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer deleteByPrimaryKey(@RequestBody MenuButton menuButton) {
		return this.menuButtonService.deleteByPrimaryKey(menuButton.getMbId());
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