package com.shinhan.day02;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		method3();

	}

	private static void method3() {
		// 10을 입력받으면 2+4+6+8+10
		// 11을 입력받으면 1+3+5+7+9+11
		
		int last, total=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("마지막값은 정수로 입력하세요 ==> ");
		last = sc.nextInt();
		int start = last%2==0?2:1;
		for(int i = start; i<=last; i+=2) {
			total += i;
			System.out.println(i);
		}
		
		System.out.printf("총합은 %d 입니다", total);
		
		sc.close();
		
	} // mehtod1
		
		
	

}
