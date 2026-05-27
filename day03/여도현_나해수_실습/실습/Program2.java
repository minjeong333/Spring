package com.acorn.prac2.실습;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Program2 {

	Calculator calculator;

	public Program2() {
	}

	@Autowired
	public Program2(Calculator calculator) {

		this.calculator = calculator;
	}

	public int printCalc(int su1, int su2) {

		int result = calculator.calcAdd(su1, su2);

		System.out.println("더하기 결과 : " + result);

		return result;
	}

	public int printDiscount(int price, int discountRate) {

		int result = calculator.calcDiscount(price, discountRate);

		System.out.println("할인 적용 금액 : " + result);

		return result;
	}

	public int printTax(int price, int taxRate) {

		int result = calculator.calcTax(price, taxRate);

		System.out.println("세금 포함 금액 : " + result);

		return result;
	}
}