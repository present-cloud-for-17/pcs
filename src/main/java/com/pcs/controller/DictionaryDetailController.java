package com.pcs.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcs.pojo.DictionaryDetail;
import com.pcs.service.IDictionaryDetailService;

@Controller
@RequestMapping("/dictionaryDetail")
public class DictionaryDetailController {
	@Resource
	private IDictionaryDetailService dictionaryDetailService;

	/**
	 * 获取单个字典详情信息
	 * 
	 * @param ddId
	 * @return
	 */
	@RequestMapping(value = "/selectByPrimaryKey.do", method = { RequestMethod.GET })
	public @ResponseBody DictionaryDetail selectByPrimaryKey(@RequestBody Integer ddId) {
		return this.dictionaryDetailService.selectByPrimaryKey(ddId);
	}

	/**
	 * 删除单个字典详情信息
	 * 
	 * @param ddId
	 * @return
	 */
	@RequestMapping(value = "/deleteByPrimaryKey.do", method = { RequestMethod.GET })
	public @ResponseBody Integer deleteByPrimaryKey(@RequestBody Integer ddId) {
		return this.dictionaryDetailService.deleteByPrimaryKey(ddId);
	}

	/**
	 * 修改单个字典详情信息
	 * 
	 * @param dictionaryDetail
	 * @return
	 */
	@RequestMapping(value = "/updateByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer updateByPrimaryKeySelective(@RequestBody DictionaryDetail dictionaryDetail) {
		return this.dictionaryDetailService.updateByPrimaryKeySelective(dictionaryDetail);
	}

	/**
	 * 添加单个字典详情信息
	 * 
	 * @param dictionaryDetail
	 * @return
	 */
	@RequestMapping(value = "/insert.do", method = { RequestMethod.POST })
	public @ResponseBody Integer insertSelective(@RequestBody DictionaryDetail dictionaryDetail) {
		return this.dictionaryDetailService.insertSelective(dictionaryDetail);
	}

	/**
	 * 查找全部字典详情信息
	 */
	@RequestMapping("/findAll.do")
	public @ResponseBody List<DictionaryDetail> findAll() {
		return this.dictionaryDetailService.findAll();
	}
}