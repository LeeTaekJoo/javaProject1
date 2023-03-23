package com.shinhan.day02;

public class 이택주 {

	public static void main(String[] args) {
		method4_4();
	}

	private static void method4_4() {
		
		
	}

	private static void method4_3() {
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				sum += i;
			} // if		
		} // for
		System.out.println("1부터 100까지 3의 배수의 총합:" + sum);
		
	} // method4_3

	private static void method4_2() {
		String grade = "B";
		
		int score = switch(grade){
			case "A"->100;
			case "B"->{
				int result = 100-20;
				yield result;
			}
			default->60;
		};
		System.out.println(score);
		
	} // method4_2

	private static void method3_6() {
		int x = 10;
		int y = 5;
		
		System.out.println((x>7)&&(y<=5)); // true
		System.out.println((x%3==2)||(y%2 != 1)); // false
		
		// 정답 : true, false
		
	} // method3_6

	private static void method3_4() {
		int value = 356;
		System.out.println(value-56);
		
		// 정답 : (value-56)
		
	} // method3_4

	private static void method3_3() {
		int pencils = 534;
		int students = 30;
		
		//학생 한 명이 가지는 연필 수
		int pencilsPerStudent = (pencils/students);
		System.out.println("학생 한 명이 가지는 연필 수 : " + pencilsPerStudent);
		
		//남은 연필 수
		int pencilsLeft = (pencils%students);
		System.out.println("남은 연필 수 : " + pencilsLeft);
		
		// 정답 : (pencils/students), (pencils%students)
		
	} // method3_3

	private static void method3_2() {
		int score = 85;
		String result = (!(score>90))? "가":"나";
		
		System.out.println(result);
		
		// 정답 : 가
		
	} // method3_2

	private static void method3_1() {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		
		// 정답 : 31
		
	} // method3_1

	private static void method3_5() {
		int top = 5;
		int bottom = 10;
		int height = 7;
		double area = (double)(top+bottom)*height/2;
		
		System.out.println(area);
		
		// 정답 : 3번
		
	} // method3_5

	private static void method4_1() {
		// 조건문과 반복문에 대해 잘못 설명한 것은 무엇입니까?
		// 1. if문은 조건식의 결과에 따라 실행 흐름을 달리할 수 있다.
		// 2. switch 문에서 사용할 수 있는 변수의 타입은 int,double이 될 수 있다.
		// 3. for 문은 카운터 변수로 지정한 횟수만큼 반복시킬 때 사용할 수 있다.
		// 4. break 문은 switch문, for문, while 문을 종료할 때 사용할 수 있다.
		
		// 정답 : 
		
	} // method4_1

} // end class
