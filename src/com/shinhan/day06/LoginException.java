package com.shinhan.day06;

// 사용자정의예외
// 만드는 이유 : 업무상Exception처리 일관성있게 만든다.
public class LoginException extends Exception{
	
	public LoginException(String errMessage) {
		super(errMessage);
	}
	
	public void printMessage() {
		System.out.println("로그인 : " + getMessage());
	}
}
