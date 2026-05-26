package com.acorn.prac2.애너테이션;

import org.springframework.stereotype.Component;

@Component
public class BCalculator implements Calculator{

	@Override
	public int calcAdd(int su1, int su2) {
		
		System.out.println(" B Calculator ");
		return su1+su2;
	}

	
}
