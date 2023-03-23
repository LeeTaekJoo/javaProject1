package com.shinhan.day04;

// class : public 또는 생략

// public : 모든패키지에서 접근가능
// protected : 같은패키지 접근가능, 다른패키지는 상속받으면 가능
// 생략(default) : 같은패키지에서만 접근가능
// private : 같은class에서만 접근가능
public class Phone {
	// 1. field/public/protected/생략/private
	protected String model;
	
	// 2. 생성자 : public/생략/private
	public Phone(){
		System.out.println("default 생성자 정의함");
	}
	
	// 3. 메소드
	public void v1()
	{
		
	}

	protected void v2()
	{
		
	}
	
	void v3()
	{
		
	}
	
	private void v4()
	{
		
	}
} // end class
