package com.acorn.prac2.spring;

public class ACalculator implements Calculator{

	@Override
	public int calcAdd(int su1, int su2) {
		
		System.out.println(" A Calculator ");
		return su1+su2;
	}

	
}
