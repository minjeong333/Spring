package com.acorn.prac2.spring;

public class BCalculator implements Calculator{

	@Override
	public int calcAdd(int su1, int su2) {
		
		System.out.println(" B Calculator ");
		return su1+su2;
	}

	
}
