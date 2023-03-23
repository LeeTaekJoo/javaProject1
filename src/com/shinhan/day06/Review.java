package com.shinhan.day06;

// 1. 변수 : 데이터를 저장하기 위한 기억장소 이름, 값 수정 가능
// 2. 상수 : 데이터를 저장하기 위한 기억장소 이름, 값 수정 불가능
// 3. enum : 상수 묶음
// 4. method : 문장들을 묶음
// 5. class : object를 만드는 틀 변수 + 상수 + method
// 6. object : class로 new한 실체
// 7. interface : 규격서, 상수+추상메서드+default method+ static method

abstract class ParentClass{
	abstract void method1();
}

interface MyInterface{
	void method2();
}

class MyClass1 extends ParentClass implements MyInterface{
	 void method1() {}
	 public void method2() {}
}

class MyClass2 extends ParentClass{
	void method1() {}
	public void method2() {}
}

public class Review {
	public static void main(String[] args) {
		
	}
	
}
