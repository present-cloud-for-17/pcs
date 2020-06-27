package com.pcs.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcs.pojo.Person;
import com.pcs.service.IPersonService;

@Controller
@RequestMapping("/person")
public class PersonController {
	@Resource
	private IPersonService personService;

	/**
	 * 获取单个师生信息
	 * 
	 * @param person
	 * @return
	 */
	@RequestMapping(value = "/selectByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Person selectByPrimaryKey(@RequestBody Person person) {
		return this.personService.selectByPrimaryKey(person.getPeId());
	}

	/**
	 * 删除单个师生信息
	 * 
	 * @param person
	 * @return
	 */
	@RequestMapping(value = "/deleteByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer deleteByPrimaryKey(@RequestBody Person person) {
		return this.personService.deleteByPrimaryKey(person.getPeId());
	}

	/**
	 * 修改单个师生信息
	 * 
	 * @param person
	 * @return
	 */
	@RequestMapping(value = "/updateByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer updateByPrimaryKeySelective(@RequestBody Person person) {
		return this.personService.updateByPrimaryKeySelective(person);
	}

	/**
	 * 添加单个师生信息
	 * 
	 * @param person
	 * @return
	 */
	@RequestMapping(value = "/insert.do", method = { RequestMethod.POST })
	public @ResponseBody Integer insertSelective(@RequestBody Person person) {
		return this.personService.insertSelective(person);
	}

	/**
	 * 查找全部师生信息
	 */
	@RequestMapping("/findAll.do")
	public @ResponseBody List<Person> findAll() {
		return this.personService.findAll();
	}
}