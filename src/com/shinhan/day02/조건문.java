package com.shinhan.day02;

import java.util.Scanner;

public class 조건문 {

	public static void main(String[] args) {
		method3();

	} // main

	private static void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("월 ==> ");
		int month = sc.nextInt();
		String message = "";
		
//		if(month==12 || month==1 || month==2) {
//			message="겨울입니다";
//		}else if(month==3 || month==4 || month==5){
//			message="봄입니다";
//		}else if(month==6 || month==7 || month==8){
//			message="여름입니다";
//		}else if(month==9 || month==10 || month==11){
//			message="가을입니다";
//		}else {
//			message="잘못입력했습니다.";
//		}
//		System.out.println(message);
		
		switch(month) {
		case 12,1,2 : message="겨울입니다.";
		break;
		case 3,4,5 : message="봄입니다.";
		break;
		case 6,7,8 : message="여름입니다.";
		break;
		case 9,10,11 : message="가을입니다.";
		break;
		
		default: message="잘못입력했습니다.";
		break;
		} // switch
		System.out.println(message);
	} // method3
	


	private static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 ==> ");
		int score = sc.nextInt();
		String grade="";
		
		switch(score) {
		case 10: grade = "A";
			
			break;
		case 9: grade = "A";
			
			break;
		case 8: grade = "B";
			
			break;
		
		case 7: grade = "C";
		
		break;
		
		case 6: grade = "D";
		
		break;
				
		default: 
			grade = "F";
			break;
		} // switch
		
		if(score>=90) {
			grade = "A";
		}else if(score>=80){
			grade ="B";
		}else if(score>=70){
			grade ="C";
		}else if(score>=60){
			grade ="D";
		}else{
			grade ="F";
		}
		System.out.println("결과는" + score + "==>" + grade);
		
	} // method2

	private static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 ==> ");
		int score = sc.nextInt();
		String grade;
		
		if(score>=90) {
			grade = "A";
		}else if(score>=80){
			grade ="B";
		}else if(score>=70){
			grade ="C";
		}else if(score>=60){
			grade ="D";
		}else{
			grade ="F";
		}
		System.out.println("결과는" + score + "==>" + grade);
		
	} // method1

} // end class
