package com.acorn.prac.db;

public class 가변인자 {

	public static void printInfo( String ...strings) { //가변인자
		for(String item : strings) {
			System.out.println(item);
		}
		
	}
	
	
	public static void main(String[] args) {
		printInfo("안녕");
		printInfo("안녕", "잘가");
		printInfo("안녕", "잘가", "빠빠");
		
	}
}
