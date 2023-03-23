package com.shinhan.day05;

// interface 구현class
public class Television implements RemoteControl{

	// RemoteContrl에서 정의만 내렸기 때문에 구현해야함 
	@Override
	public void powerOn() {
		System.out.println(getClass().getSimpleName()+"전원을 켠다.");
		
	}

	@Override
	public void powerOff() {
		System.out.println(getClass().getSimpleName()+"전원을 끈다.");
		
	}

}
