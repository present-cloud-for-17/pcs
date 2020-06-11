package com.pcs.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcs.pojo.Dictionary;
import com.pcs.service.IDictionaryService;

@Controller
@RequestMapping("/dictionary")
public class DictionaryController {
	@Resource
	private IDictionaryService dictionaryService;

	/**
	 * 获取单个字典信息
	 * 
	 * @param dId
	 * @return
	 */
	@RequestMapping(value = "/selectByPrimaryKey.do", method = { RequestMethod.GET })
	public @ResponseBody Dictionary selectByPrimaryKey(@RequestBody Integer dId) {
		return this.dictionaryService.selectByPrimaryKey(dId);
	}

	/**
	 * 删除单个字典信息
	 * 
	 * @param dId
	 * @return
	 */
	@RequestMapping(value = "/deleteByPrimaryKey.do", method = { RequestMethod.GET })
	public @ResponseBody Integer deleteByPrimaryKey(@RequestBody Integer dId) {
		return this.dictionaryService.deleteByPrimaryKey(dId);
	}

	/**
	 * 修改单个字典信息
	 * 
	 * @param dictionary
	 * @return
	 */
	@RequestMapping(value = "/updateByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer updateByPrimaryKeySelective(@RequestBody Dictionary dictionary) {
		return this.dictionaryService.updateByPrimaryKeySelective(dictionary);
	}

	/**
	 * 添加单个字典信息
	 * 
	 * @param dictionary
	 * @return
	 */
	@RequestMapping(value = "/insert.do", method = { RequestMethod.POST })
	public @ResponseBody Integer insertSelective(@RequestBody Dictionary dictionary) {
		return this.dictionaryService.insertSelective(dictionary);
	}

	/**
	 * 查找全部字典信息
	 */
	@RequestMapping("/findAll.do")
	public @ResponseBody List<Dictionary> findAll() {
		return this.dictionaryService.findAll();
	}
}