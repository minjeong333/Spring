package com.acorn.prac.mvc;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//애너테이션은 component나 service 둘 중에 하나 사용
//@Component 
@Service
public class CalcService {

	public int calc ( int num1, int num2, String operator) {
		int result=0;
		
		//
		switch(operator) {
		case "add":
			result = num1+num2;
			break;
		case "sub":
			result = num1-num2;
			break;
		case "mul":
			result = num1*num2;
			break;
		case "div":
			result = num1/num2;
			break;
		}
		return result;
	}
}
