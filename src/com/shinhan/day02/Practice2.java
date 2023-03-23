package com.shinhan.day02;

import java.util.Scanner;

public class Practice2 {

	
	public static void main(String[] args) {			
		method1();
		
	} // main

	private static void method1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String inputString = sc.nextLine();
		inputString = inputString.toUpperCase();
		
		for(int i=0; i<=inputString.length(); i++) {
			System.out.println(inputString.substring(0, i));
			
		} // for
		
		
//		System.out.println(inputString.length());
//		System.out.println(inputString.substring(0,2)); // 짤라서 추출
//		System.out.println(inputString.toUpperCase()); // 대문자 추출
		
		sc.close();
		
		
		
	} // method1

} // end class
