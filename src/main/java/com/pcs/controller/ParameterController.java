package com.pcs.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcs.pojo.Parameter;
import com.pcs.service.IParameterService;

@Controller
@RequestMapping("/parameter")
public class ParameterController {
	@Resource
	private IParameterService parameterService;

	/**
	 * 获取单个参数信息
	 * 
	 * @param parameter
	 * @return
	 */
	@RequestMapping(value = "/selectByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Parameter selectByPrimaryKey(@RequestBody Parameter parameter) {
		return this.parameterService.selectByPrimaryKey(parameter.getPaId());
	}

	/**
	 * 删除单个参数信息
	 * 
	 * @param parameter
	 * @return
	 */
	@RequestMapping(value = "/deleteByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer deleteByPrimaryKey(@RequestBody Parameter parameter) {
		return this.parameterService.deleteByPrimaryKey(parameter.getPaId());
	}

	/**
	 * 修改单个参数信息
	 * 
	 * @param parameter
	 * @return
	 */
	@RequestMapping(value = "/updateByPrimaryKey.do", method = { RequestMethod.POST })
	public @ResponseBody Integer updateByPrimaryKeySelective(@RequestBody Parameter parameter) {
		return this.parameterService.updateByPrimaryKeySelective(parameter);
	}

	/**
	 * 添加单个参数信息
	 * 
	 * @param parameter
	 * @return
	 */
	@RequestMapping(value = "/insert.do", method = { RequestMethod.POST })
	public @ResponseBody Integer insertSelective(@RequestBody Parameter parameter) {
		return this.parameterService.insertSelective(parameter);
	}

	/**
	 * 查找全部参数信息
	 */
	@RequestMapping("/findAll.do")
	public @ResponseBody List<Parameter> findAll() {
		return this.parameterService.findAll();
	}
}