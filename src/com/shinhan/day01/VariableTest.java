package com.shinhan.day01;

// class = 변수 + 함수
// VariableTest.java -> 컴파일 VariableTest.class
// 실행
// 1. JVM이 VariableTest class Loader에 의해 Load(static이 method영역에 올라간다.)
// 2. 검증
// 3. main시작
public class VariableTest {
	
	int score;
	public static void main(String[] args) {
		// 1. 변수선언
		int a; // 지역변수(local)
		
		VariableTest aa = new VariableTest();
		System.out.println(aa.score);
		
//		System.out.println(a); // 초기화하지않으면 사용불가
//		System.out.println(score); // static이 non-static 사용불가
		
		// 2. 변수사용
		a = 10;
		
		System.out.println(a);
		System.out.println(a+20);
		
		// 3. 선언+사용
		int a2=30;
		System.out.println(a2);
	} // main

} // end class
