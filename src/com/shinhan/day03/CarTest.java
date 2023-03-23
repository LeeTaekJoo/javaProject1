package com.shinhan.day03;

public class CarTest {

	public static void main(String[] args) {
		
		f1();

	} // main

	private static void f1() {
		// 자동차객체를 만든다.
		// 1. 객체 참조 변수를 선언
		int a; // a변수에 int타입의 값을 담을수 있다.
		Car car1, car2; // car1변수에 Car객체를 담을수 있다.
		
		
		// 2. 객체를 생성 ... Heap에 객체가 생성되고 주소는 변수에 담는다.
		// 객체가 생성되면 변수들은 자동으로 초기화된다.
		car1 = new Car();
		car2 = new Car();
		
		// 3. 객체를 사용
		car1.model = "제네시스";
		car1.color = "Black";
		car1.price = 5000;
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.price);
		
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.price);
		
		car1.go();
		car2.go();
	}

} // end class
