package com.acorn.prac2.애너테이션;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//계산을 해주는 프로그램
//스프링에게 객체 생성 bean
@Component 
public class Program {

	
	Calculator calculator;  //의존성 dependency
	
	
	// 생성자
	public Program() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public Program(Calculator calculator) { //생성자 주입
		super();
		this.calculator = calculator;
	}


	// 세터주입
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	

	public  void printCalc(int su1, int su2) {

		//
		int result = calculator.calcAdd(su1, su2);
		
		System.out.println( result + "입니다");
		
	}

}
