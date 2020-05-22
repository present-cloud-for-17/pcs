package com.pcs.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcs.pojo.School;
import com.pcs.service.ISchoolService;

@Controller
@RequestMapping("/school")
public class SchoolController {
	@Resource
	private ISchoolService schoolService;

	/**
	 * 获取单个学校信息
	 * 
	 * @param sId
	 * @return
	 */
	@RequestMapping(value = "/selectByPrimaryKey.do", method = { RequestMethod.GET })
	public @ResponseBody School selectByPrimaryKey(@RequestBody Integer sId) {
		return this.schoolService.selectByPrimaryKey(sId);
	}

	/**
	 * 删除单个学校信息
	 * 
	 * @param sId
	 * @return
	 */
	@RequestMapping(value = "/deleteByPrimaryKey.do", method = { RequestMethod.GET })
	public @ResponseBody Integer deleteByPrimaryKey(@RequestBody Integer sId) {
		return this.schoolService.deleteByPrimaryKey(sId);
	}

	/**
	 * 修改单个学校信息
	 * 
	 * @param school
	 * @return
	 */
	@RequestMapping(value = "/updateByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer updateByPrimaryKeySelective(@RequestBody School school) {
		return this.schoolService.updateByPrimaryKeySelective(school);
	}

	/**
	 * 添加单个学校信息
	 * 
	 * @param school
	 * @return
	 */
	@RequestMapping(value = "/insert.do", method = { RequestMethod.POST })
	public @ResponseBody Integer insertSelective(@RequestBody School school) {
		return this.schoolService.insertSelective(school);
	}

	/**
	 * 查找全部学校信息
	 */
	@RequestMapping("/findAll.do")
	public @ResponseBody List<School> findAll() {
		return this.schoolService.findAll();
	}
}