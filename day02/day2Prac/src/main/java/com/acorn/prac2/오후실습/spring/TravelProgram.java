package com.acorn.prac2.오후실습.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class TravelProgram {
	
	Travel travel;

	//세터 주입
	public void setTravel(Travel travel) {
		this.travel = travel;
	}

	//기본생성자
	public TravelProgram() {
		// TODO Auto-generated constructor stub
	}
	
	//생성자 주입
	public TravelProgram(Travel travel) {
		super();
		this.travel = travel;
	}
	
	public void run(int budget) {
		travel.recommand(budget); 
	}
	
	
	
	
	
}
