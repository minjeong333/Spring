package com.acorn.prac2.Ex;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Ex03Controller {

	
	//사용자가 원하는 단 정보 응답하기
	
	//필드주입
	//@Autowired
	Ex03Service service;
	
	//생성자 주입
	@Autowired
	public Ex03Controller(Ex03Service service) {
		super();
		this.service = service;
	}
	
	public Ex03Controller() {
		// TODO Auto-generated constructor stub
	}
	
	//세터 주입
	@Autowired
	public void setService(Ex03Service service) {
		this.service = service;
	}
	
	
	@RequestMapping(value = "/ex03" , method=RequestMethod.GET)
	public String ex03( @RequestParam ( defaultValue = "2"  , required = false) int dan, Model model) {
		
		System.out.println("dan + dan");
		
		//
		List<String> result = service.getDan(dan);
		model.addAttribute("list", result);
		return "ex03View";
		
	}


	
	//
	
	//
	
	//
}
