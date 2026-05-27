package com.acorn.prac2.실습;

import org.springframework.stereotype.Component;

@Component
public class BCalculator2 implements Calculator {

	@Override
	public int calcAdd(int su1, int su2) {

		System.out.println("B calculator2 - 일반 계산");
		return su1 + su2;
	}

	@Override
	public int calcDiscount(int price, int discountRate) {

		System.out.println("B calculator2 - 할인 계산");
		return price - (price * discountRate / 100);
	}

	@Override
	public int calcTax(int price, int taxRate) {

		System.out.println("B calculator2 - 세금 계산");
		return price + (price * taxRate / 100);
	}
}