package com.pcs.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcs.pojo.Course;
import com.pcs.service.ICourseService;

@Controller
@RequestMapping("/course")
public class CourseController {
	@Resource
	private ICourseService courseService;

	/**
	 * 获取单个课程信息
	 * 
	 * @param cId
	 * @return
	 */
	@RequestMapping(value = "/selectByPrimaryKey.do", method = { RequestMethod.GET })
	public @ResponseBody Course selectByPrimaryKey(@RequestBody Integer cId) {
		return this.courseService.selectByPrimaryKey(cId);
	}

	/**
	 * 删除单个课程信息
	 * 
	 * @param cId
	 * @return
	 */
	@RequestMapping(value = "/deleteByPrimaryKey.do", method = { RequestMethod.GET })
	public @ResponseBody Integer deleteByPrimaryKey(@RequestBody Integer cId) {
		return this.courseService.deleteByPrimaryKey(cId);
	}

	/**
	 * 修改单个课程信息
	 * 
	 * @param course
	 * @return
	 */
	@RequestMapping(value = "/updateByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer updateByPrimaryKeySelective(@RequestBody Course course) {
		return this.courseService.updateByPrimaryKeySelective(course);
	}

	/**
	 * 添加单个课程信息
	 * 
	 * @param course
	 * @return
	 */
	@RequestMapping(value = "/insert.do", method = { RequestMethod.POST })
	public @ResponseBody Integer insertSelective(@RequestBody Course course) {
		return this.courseService.insertSelective(course);
	}

	/**
	 * 查找全部课程信息
	 */
	@RequestMapping("/findAll.do")
	public @ResponseBody List<Course> findAll() {
		return this.courseService.findAll();
	}
}