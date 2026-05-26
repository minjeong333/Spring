package com.acorn.prac2.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.acorn.prac2.web.Program;

@Controller
public class CalcProgramController {

	@Autowired
	Program p;
	
	//매핑, 매서드 단위 매핑
	//cal?su1=9&su2=10
	@RequestMapping(value="/cal", method= RequestMethod.GET)
	//@RequestParam
	public String method1(int su1, int su2) {
		p.printCalc(su1, su2);
		
		return "calView"; //뷰이름
	}
}
