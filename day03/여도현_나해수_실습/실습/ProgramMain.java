package com.acorn.prac2.실습;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ProgramMain {

	public static void main(String[] args) {

		// xml 읽어서 spring container 생성
		ApplicationContext ac =
				new GenericXmlApplicationContext(
						"com/acorn/prac2/실습/setting.xml");

		// bean 가져오기
		Program program = (Program) ac.getBean("p");

		// 실행
		program.printCalc(10, 20);

		program.printDiscount(10000, 10);

		program.printTax(10000, 10);

	}

}