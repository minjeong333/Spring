package com.acorn.prac2.오후실습.spring;

import org.springframework.stereotype.Component;

public class FoodTravel implements Travel{

	@Override
	public void recommand(int budget) {

		System.out.println("🍜 먹방 여행 추천");

        if(budget >= 500_000) {
            System.out.println("추천 장소 : 오사카");
        } else {
            System.out.println("추천 장소 : 전주");
        }
		
	}

}
