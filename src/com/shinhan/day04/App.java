package com.shinhan.day04;

public class App {

	public static void main(String[] args) {
		
//		Integer a = new Integer(100);
//		Integer a2 = 100;
//		System.out.println(a.MAX_VALUE);
//		System.out.println(Integer.MAX_VALUE);
		
		sum(1,2);
		sum(1,2,3,4,5,6,7,8,9,10);
		sum(2,3,4,6,1,2);
		sum(1,2,3);
		sum(1.5,2.5);

	} // main
	
	// 메서드 overloading : 메서드 이름은 같고 매개변수 사양이 다르다.
	// 파라미터 자동형변환된다.
	static void sum(int...arr){ // int[] arr와 같다.
 		int total = 0;
		for(int su : arr) {
			total += su;
		}
		if(total==0) return; // return : 함수중단하고 호출한 곳으로 돌아간다.
		System.out.println("가변길이매개변수==>"+total);
	}
	static void sum(double a, double b){
		System.out.println("합계A==>"+(a+b));
	}
	static void sum(int a, int b,int c){
		System.out.println("합계B==>"+(a+b+c));
	}

	private static void f1() {
		Calculator[] arr = new Calculator[4];
		
		arr[0] = new Calculator("red");
		arr[0].setModel("Casio");
		arr[1] = new Calculator("black");
		arr[2] = new Calculator("B", "blue");
		arr[3] = new Calculator("C", "green", 2000);
		
		for(Calculator cc :arr) {
			print(cc);
		}

	}

	private static void print(Calculator cal) {
		System.out.println(cal.getModel());
		System.out.println(cal.getColor());
		System.out.println(cal.getPrice());
		cal.powerOn();
		cal.powerOff();
		System.out.println(cal.add(1, 2));
		System.out.println(cal.sub(1, 2));
	}

} // end class
