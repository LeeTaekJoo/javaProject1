package com.shinhan.day11;


public class LambdaTest2 {

	
	public static void main(String[] args) {
		
		f2(100);
	}
	static String subjet="자바";
	private static void f2(int su1) { // 파라미터는 지역변수
		int su2 = 200; // 지역변수	
		int su3 = 300;
		su3++;
		
		// 내부class에서 지역변수 사용한다면 final의 특성을 갖는다. (수정불가)
		// su1++;
		// su2++;
		// 1. 익명구현class
		Calculable2 f = (a,b)-> {
				
				System.out.println("람다표현식..." + subjet);
				return a+b+su1+su2;
			
		};
		int result = f.calculate(1, 2);
		System.out.println(result);
		
	}

	private static void f1(int su1) { // 파라미터는 지역변수
		int su2 = 200; // 지역변수		
		
		// 내부class에서 지역변수 사용한다면 final의 특성을 갖는다. (수정불가)
		// su1++;
		// su2++;
		// 1. 익명구현class
		Calculable2 f = new Calculable2() {
			public int calculate(int x, int y) {
				
				System.out.println("익명구현객체");
				return x+y+su1+su2;
			}
		};
		int result = f.calculate(1, 2);
		System.out.println(result);
		
	}

}
