package com.pcs.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pcs.pojo.DictionaryDetail;
import com.pcs.service.IDictionaryDetailService;

@Controller
@RequestMapping("/dictionaryDetail")
public class DictionaryDetailController {
	@Resource
	private IDictionaryDetailService dictionaryDetailService;

	@RequestMapping("/selectByPrimaryKey")
	public String toIndex(HttpServletRequest request, Model model) {
		int ddId = Integer.parseInt(request.getParameter("ddid"));
		DictionaryDetail dictionaryDetail = this.dictionaryDetailService.selectByPrimaryKey(ddId);
		model.addAttribute("dictionaryDetail", dictionaryDetail);
		return "showDictionaryDetail";
	}
}