package com.acorn.prac2.실습;

// 다른 계산기 구현체
public class BCalculator implements Calculator {

	@Override
	public int calcAdd(int su1, int su2) {

		System.out.println("B calculator - 일반 더하기");
		return su1 + su2;
	}

	@Override
	public int calcDiscount(int price, int discountRate) {

		System.out.println("B calculator - 할인 계산");
		return price - (price * discountRate / 100);
	}

	@Override
	public int calcTax(int price, int taxRate) {

		System.out.println("B calculator - 세금 계산");
		return price + (price * taxRate / 100);
	}

}