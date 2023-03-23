package com.shinhan.day06;


public class Button {
	
	// field 
	int a;
	private ClickListener listener;
	
	// method
	void f1() {
		this.a = a;
	}
	
	void setListener(ClickListener listener) {
		this.listener = listener;
	}
	
	public void buttonClick() {
		listener.onClick();
	}
	
	// 내부interface
	static interface ClickListener{
		
		void onClick();
		
	} // interface

} // class
