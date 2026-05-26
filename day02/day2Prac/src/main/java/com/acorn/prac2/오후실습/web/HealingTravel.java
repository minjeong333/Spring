package com.acorn.prac2.오후실습.web;

import org.springframework.stereotype.Component;

@Component("healing")
public class HealingTravel implements Travel {

	@Override
	public void recommand(int budget) {

		System.out.println("🌴 힐링 여행 추천!");
		
		if(budget >= 500_000) {
			 System.out.println("추천 장소: 오키나와");
			
		}else {
			System.out.println("추천 장소: 제주도");
		}
	}



}
