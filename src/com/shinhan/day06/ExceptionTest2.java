package com.shinhan.day06;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		double a = Math.random();
		
		int b = (int)(a*10)+1;	// 0<=
		System.out.println(a);		
		System.out.println(b);

		// Exception : 자동발생, 강제발생
//		int a =10/0; // 자동
		String pass = "123456";
		
		char ch = pass.charAt(0);
		try {
		if(ch<'A' || ch>'Z') {
			throw new LoginException("대문자시작해야한다.");
		}
	}catch (LoginException e) {
		System.out.println(e.getMessage());
		e.printMessage();
	}
		System.out.println("main end");
}
}
