package com.pcs.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
	 * 获取单个校园信息
	 * 
	 * @param school
	 * @return
	 */
	@RequestMapping(value = "/selectByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody School selectByPrimaryKey(@RequestBody School school) {
		return this.schoolService.selectByPrimaryKey(school.getsId());
	}

	/**
	 * 删除单个校园信息
	 * 
	 * @param school
	 * @return
	 */
	@RequestMapping(value = "/deleteByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer deleteByPrimaryKey(@RequestBody School school) {
		return this.schoolService.deleteByPrimaryKey(school.getsId());
	}

	/**
	 * 修改单个校园信息
	 * 
	 * @param school
	 * @return
	 */
	@RequestMapping(value = "/updateByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer updateByPrimaryKeySelective(@RequestBody School school) {
		return this.schoolService.updateByPrimaryKeySelective(school);
	}

	/**
	 * 添加单个校园信息
	 * 
	 * @param school
	 * @return
	 */
	@RequestMapping(value = "/insert.do", method = { RequestMethod.POST })
	public @ResponseBody Integer insertSelective(@RequestBody School school) {
		return this.schoolService.insertSelective(school);
	}

	/**
	 * 查找全部校园信息
	 */
	@RequestMapping("/findAll.do")
	public @ResponseBody List<School> findAll() {
		return this.schoolService.findAll();
	}

	/**
	 * 级联方式校园信息
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping("/classify.do")
	public @ResponseBody List<Map<String, Object>> classify() {
		List<School> ls = this.schoolService.findAll();
		List<Map<String, Object>> lm = new ArrayList<Map<String, Object>>();
		Set hs = new HashSet();
		for (School school : ls) {
			hs.add(school.getsName());
		}
		Iterator it = hs.iterator();
		while (it.hasNext()) { // 遍历所有学校
			Map map = new HashMap();
			String sName = (String) it.next();
			map.put("sName", sName);
			List<Map<String, Object>> lo = new ArrayList<Map<String, Object>>();
			Set hs1 = new HashSet();
			for (School school1 : ls) {
				if (sName.equals(school1.getsName())) {
					hs1.add(school1.getCollege());
				}
			}
			Iterator it1 = hs1.iterator();
			while (it1.hasNext()) { // 遍历当前学校所有专业
				Map map1 = new HashMap();
				String college = (String) it1.next();
				map1.put("college", college);
				List<String> majors = new ArrayList<>();
				for (School school2 : ls) {
					if (college.equals(school2.getCollege()) && sName.equals(school2.getsName())) {
						majors.add(school2.getMajor());
					}
				}
				map1.put("major", majors);
				lo.add(map1);
			}
			map.put("colleges", lo);
			lm.add(map);
		}
		return lm;
	}
}