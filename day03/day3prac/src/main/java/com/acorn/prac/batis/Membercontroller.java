package com.acorn.prac.batis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Membercontroller {

	@Autowired
	MemberService service;
	
	//
	@RequestMapping(value = "/list", method=RequestMethod.GET)
	public String getMembers(Model model) throws Exception {
		
		
		List<Member> list = service.getMemberList();
		model.addAttribute("list", list);
		return "list";
	}
}
