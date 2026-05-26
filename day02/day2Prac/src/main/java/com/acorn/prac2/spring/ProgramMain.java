package com.acorn.prac2.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ProgramMain {

	public static void main(String[] args) {
		
		ApplicationContext ac = new GenericXmlApplicationContext("com/acorn/prac2/spring/setting.xml");
				
		//스프링컨테이너로 부터 빈을 얻어오는 두가지 방법	
		// 1. bean의 클래스 type
		// 2. bean의 id값
		
		Program program = ac.getBean(Program.class);  // 클래스 타입으로
		program.printCalc(8, 5);
		
		Program program2 = (Program) ac.getBean("p");
		program2.printCalc(5, 1);
		
		
		if(program == program2) {
			System.out.println("스프링컨테이너는 하나의 객체를 생성하고 관리한다");
		}
		
	}

}
