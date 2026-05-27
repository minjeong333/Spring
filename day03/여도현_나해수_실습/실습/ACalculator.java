package com.acorn.prac2.실습;

// 일반 계산기 + 할인/세금 계산기
public class ACalculator implements Calculator {

	@Override
	public int calcAdd(int su1, int su2) {

		System.out.println("A calculator - 일반 더하기");
		return su1 + su2;
	}

	@Override
	public int calcDiscount(int price, int discountRate) {

		System.out.println("A calculator - 할인 계산");
		return price - (price * discountRate / 100);
	}

	@Override
	public int calcTax(int price, int taxRate) {

		System.out.println("A calculator - 세금 계산");
		return price + (price * taxRate / 100);
	}

}