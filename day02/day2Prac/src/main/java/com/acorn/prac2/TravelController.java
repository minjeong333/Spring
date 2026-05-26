package com.acorn.prac2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.acorn.prac2.오후실습.spring.TravelProgram;

@Controller
public class TravelController {

	@Autowired
	TravelProgram travelProgram;
	
	@RequestMapping("/travel")
	public void travel() {
		travelProgram.run(500_000);
	}
}
