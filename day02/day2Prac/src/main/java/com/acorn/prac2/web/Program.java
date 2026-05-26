package com.acorn.prac2.web;

public class Program {

	
	Calculator calculator;  //의존성 dependency
	
	
	// 생성자
	public Program() {
		// TODO Auto-generated constructor stub
	}
	
	
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
