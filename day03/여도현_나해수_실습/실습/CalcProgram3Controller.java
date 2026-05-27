package com.acorn.prac2.실습;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalcProgram3Controller {

	@Autowired
	Program2 p;

	@RequestMapping("/cal3")
	public String calc(int su1, int su2, Model model) {

		int result = p.printCalc(su1, su2);

		model.addAttribute("title", "일반 계산기");
		model.addAttribute("result", result);

		return "calView2";
	}

	@RequestMapping("/discount2")
	public String discount(int price, int discountRate, Model model) {

		int result = p.printDiscount(price, discountRate);

		model.addAttribute("title", "할인 계산기");
		model.addAttribute("result", result);

		return "calView2";
	}

	@RequestMapping("/tax2")
	public String tax(int price, int taxRate, Model model) {

		int result = p.printTax(price, taxRate);

		model.addAttribute("title", "세금 계산기");
		model.addAttribute("result", result);

		return "calView2";
	}
}