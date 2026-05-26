package com.acorn.prac2.오후실습.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TravelProgram {
	
	@Autowired //"Travel 타입 객체 하나 넣어줘"
	@Qualifier("food") // "그중에서도 food 객체 넣어줘"
	Travel travel;

	public void setTravel(Travel travel) {
		this.travel = travel;
	}

	public TravelProgram() {
		// TODO Auto-generated constructor stub
	}
	
	public TravelProgram(Travel travel) {
		super();
		this.travel = travel;
	}
	
	public void run(int budget) {
		travel.recommand(budget); 
	}
	
	
	
	
	
}
