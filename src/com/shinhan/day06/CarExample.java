package com.shinhan.day06;

class Car{
	class Tire{}
	static class Engine{}
	void go() {
		class LocalClass{}
		LocalClass v1 = new LocalClass();
		System.out.println(v1);
	}
}

public class CarExample {

	
	
	
	public static void main(String[] args) {
		Car myCar = new Car();
		Car.Tire v2 = new Car().new Tire();
		Car.Engine v3 = new Car.Engine();


	}

}
