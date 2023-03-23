package com.shinhan.day05;

public class KumhoTire extends Tire{
	String intro = "금호타이어 최고~";
	
	void method2() {
		System.out.println("KumhoTire만 가지는 기능");
	}

	@Override
	void roll() {
		System.out.println("KumhoTire Override.");
		
	}
	
	

} // end class
