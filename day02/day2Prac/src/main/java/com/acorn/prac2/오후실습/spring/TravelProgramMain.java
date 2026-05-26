package com.acorn.prac2.오후실습.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

public class TravelProgramMain {
	
	 public static void main(String[] args) {
		 
		 
		 TravelProgram program = new TravelProgram();
		 
//		 Travel travel = new FoodTravel(); 
//		 Travel travel = new HealingTravel(); 
		 Travel travel = new ActivityTravel(); 
		 
		 
		 program.setTravel( travel);
		 
		 program.run(100_000);
	}
 
}
