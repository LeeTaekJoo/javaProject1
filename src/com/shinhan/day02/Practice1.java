package com.shinhan.day02;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		
		mehtod1();
		

	} // main

	private static void mehtod1() {
		
		int first, last, increment, total=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("초기값을 정수로 입력하세요 ==> ");
		first = sc.nextInt();
		
		System.out.print("마지막값은 정수로 입력하세요 ==> ");
		last = sc.nextInt();
		
		System.out.print("증가분을 정수로 입력하세요 ==> ");
		increment = sc.nextInt();
		
		for(int i = first; i<=last; i+=increment) {
			total += i;
		}
		
		System.out.printf("총합은 %d 입니다", total);
		
		sc.close();
		
	} // mehtod1

} // end class
