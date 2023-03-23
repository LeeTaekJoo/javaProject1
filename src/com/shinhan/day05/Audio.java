package com.shinhan.day05;

// interface 구현class
public class Audio implements RemoteControl, WIFI{

	// RemoteContrl에서 정의만 내렸기 때문에 구현해야함 
	@Override
	public void powerOn() {
		System.out.println(getClass().getSimpleName()+"전원을 켠다.");
		
	}

	@Override
	public void powerOff() {
		System.out.println(getClass().getSimpleName()+"전원을 끈다.");
		
	}

	@Override
	public void display() {
		// RemoteControl default메서드는 재정의 가능
		RemoteControl.super.display();
		System.out.println("default method재정의");
	}
	
	void display2() {		
		System.out.println("static");
	}

	@Override
	public void wifiTurnOn() {
		System.out.println("wifi turn on !!!");
		
	}
	
	

}
