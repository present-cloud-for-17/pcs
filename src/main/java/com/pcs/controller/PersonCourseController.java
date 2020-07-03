package com.pcs.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcs.pojo.PersonCourse;
import com.pcs.service.IPersonCourseService;

@Controller
@RequestMapping("/personCourse")
public class PersonCourseController {
	@Resource
	private IPersonCourseService personCourseService;

	/**
	 * 获取单个师生课程信息
	 * 
	 * @param personCourse
	 * @return
	 */
	@RequestMapping(value = "/selectByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody PersonCourse selectByPrimaryKey(@RequestBody PersonCourse personCourse) {
		return this.personCourseService.selectByPrimaryKey(personCourse.getPcId());
	}

	/**
	 * 删除单个师生课程信息
	 * 
	 * @param personCourse
	 * @return
	 */
	@RequestMapping(value = "/deleteByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer deleteByPrimaryKey(@RequestBody PersonCourse personCourse) {
		return this.personCourseService.deleteByPrimaryKey(personCourse.getPcId());
	}

	/**
	 * 修改单个师生课程信息
	 * 
	 * @param personCourse
	 * @return
	 */
	@RequestMapping(value = "/updateByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer updateByPrimaryKeySelective(@RequestBody PersonCourse personCourse) {
		return this.personCourseService.updateByPrimaryKeySelective(personCourse);
	}

	/**
	 * 添加单个师生课程信息
	 * 
	 * @param personCourse
	 * @return
	 */
	@RequestMapping(value = "/insert.do", method = { RequestMethod.POST })
	public @ResponseBody Integer insertSelective(@RequestBody PersonCourse personCourse) {
		return this.personCourseService.insertSelective(personCourse);
	}

	/**
	 * 查找全部师生课程信息
	 */
	@RequestMapping("/findAll.do")
	public @ResponseBody List<PersonCourse> findAll() {
		return this.personCourseService.findAll();
	}

	/**
	 * 我创建的
	 */
	@RequestMapping("/createdCourse.do")
	public @ResponseBody List<PersonCourse> createdCourse(@RequestBody PersonCourse personCourse) {
		return this.personCourseService.createdCourse(personCourse);
	}

	/**
	 * 我加入的
	 */
	@RequestMapping("/addedCourse.do")
	public @ResponseBody List<PersonCourse> addedCourse(@RequestBody PersonCourse personCourse) {
		return this.personCourseService.addedCourse(personCourse);
	}

	/**
	 * 根据班课编号显示所有成员
	 */
	@RequestMapping("/selectPersonBycId.do")
	public @ResponseBody List<PersonCourse> selectPersonBycId(@RequestBody PersonCourse personCourse) {
		return this.personCourseService.selectPersonBycId(personCourse);
	}
}