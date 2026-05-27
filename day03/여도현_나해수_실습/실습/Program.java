package com.acorn.prac2.실습;

// 계산을 해주는 프로그램
public class Program {

	// 의존성
	Calculator calculator;

	// 기본 생성자
	public Program() {
	}

	// 생성자 주입
	public Program(Calculator calculator) {

		this.calculator = calculator;
	}

	// setter 주입
	public void setCalculator(Calculator calculator) {

		this.calculator = calculator;
	}

	// 일반 계산
	public void printCalc(int su1, int su2) {

		int result = calculator.calcAdd(su1, su2);

		System.out.println("더하기 결과 : " + result);
	}

	// 할인 계산
	public void printDiscount(int price, int discountRate) {

		int result = calculator.calcDiscount(price, discountRate);

		System.out.println("할인 적용 금액 : " + result);
	}

	// 세금 계산
	public void printTax(int price, int taxRate) {

		int result = calculator.calcTax(price, taxRate);

		System.out.println("세금 포함 금액 : " + result);
	}

}