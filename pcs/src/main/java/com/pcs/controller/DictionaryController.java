package com.pcs.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pcs.pojo.Dictionary;
import com.pcs.service.IDictionaryService;

@Controller
@RequestMapping("/dictionary")
public class DictionaryController {
	@Resource
	private IDictionaryService dictionaryService;

	@RequestMapping("/selectByPrimaryKey")
	public String toIndex(HttpServletRequest request, Model model) {
		int dId = Integer.parseInt(request.getParameter("did"));
		Dictionary dictionary = this.dictionaryService.selectByPrimaryKey(dId);
		model.addAttribute("dictionary", dictionary);
		return "showDictionary";
	}
}