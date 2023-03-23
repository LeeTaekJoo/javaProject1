package com.shinhan.day05;


// abstract class --> 추상메서드가 1개이상 있다. 
public abstract class Tire {
 
	// 추상메서드 --> 정의는 있고 구현{} 은 없다. 구현은 상속받은 자식class가 반드시한다(Override->재정의한다).
	abstract void roll(); 
	
	void f1() {
		System.out.println("Tire Class f1 method~~");
	}
	void f2() {
		System.out.println("Tire Class f2 method~~");
	}
} // Tire
