package com.acorn.prac2.오후실습.web;

import org.springframework.stereotype.Component;

@Component("activity")
public class ActivityTravel implements Travel {

	@Override
	public void recommand(int budget) {

		System.out.println("🏄 액티비티 여행 추천");

		if (budget >= 500_000) {
			System.out.println("추천 장소 : 세부 호핑투어");
		} else {
			System.out.println("추천 장소 : 강촌 레일바이크");
		}
	}
}