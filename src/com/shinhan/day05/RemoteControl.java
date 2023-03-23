package com.shinhan.day05;

// abstract class --> 변수 + 상수 + 생성자 + 일반메서드 + 추상메서드
// interface(규격서) --> 상수 + 추상메서드 + (default+메서드+static메서드+private메서드)
public interface RemoteControl {
	
	// 보통 정의만 함
	public abstract void powerOn();
	void powerOff();
	
	default void display() {
		System.out.println("모든 구현class안에 추가");
	}
	static void display2() {
		System.out.println("모든 구현class안에 재정의 불가, interface 소유");
	}
} // end interface
