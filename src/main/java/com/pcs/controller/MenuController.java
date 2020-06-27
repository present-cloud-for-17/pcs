package com.pcs.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcs.pojo.Menu;
import com.pcs.service.IMenuService;

@Controller
@RequestMapping("/menu")
public class MenuController {
	@Resource
	private IMenuService menuService;

	/**
	 * 获取单个菜单信息
	 * 
	 * @param menu
	 * @return
	 */
	@RequestMapping(value = "/selectByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Menu selectByPrimaryKey(@RequestBody Menu menu) {
		return this.menuService.selectByPrimaryKey(menu.getmId());
	}

	/**
	 * 删除单个菜单信息
	 * 
	 * @param menu
	 * @return
	 */
	@RequestMapping(value = "/deleteByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer deleteByPrimaryKey(@RequestBody Menu menu) {
		return this.menuService.deleteByPrimaryKey(menu.getmId());
	}

	/**
	 * 修改单个菜单信息
	 * 
	 * @param menu
	 * @return
	 */
	@RequestMapping(value = "/updateByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer updateByPrimaryKeySelective(@RequestBody Menu menu) {
		return this.menuService.updateByPrimaryKeySelective(menu);
	}

	/**
	 * 添加单个菜单信息
	 * 
	 * @param menu
	 * @return
	 */
	@RequestMapping(value = "/insert.do", method = { RequestMethod.POST })
	public @ResponseBody Integer insertSelective(@RequestBody Menu menu) {
		return this.menuService.insertSelective(menu);
	}

	/**
	 * 查找全部菜单信息
	 */
	@RequestMapping("/findAll.do")
	public @ResponseBody List<Menu> findAll() {
		return this.menuService.findAll();
	}
}