package com.shinhan.day02;

import java.io.IOException;
// javalang패키지에 있는 class는 import없이 사용한다.
import java.io.InputStream;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) throws IOException {
		f2();

	} // main

	private static void f2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 ==>");
		int score = sc.nextInt();
		System.out.print("이름을 입력하세요 ==>");
		String name = sc.next();
		System.out.print("메모를 입력하세요 ==>");
		sc.nextLine();
		String memo = sc.nextLine();
		
		System.out.println(name + "==>" + score);
		System.out.println(memo);
		
	} // f2

	private static void f1() throws IOException {
		// 사용자 입력받기
		System.out.println("f1 function");
		System.out.println("점수입력>>");
		InputStream is = System.in;
		
		int i;
		while((i = is.read())!=13) {
			System.out.print((char)i);
		};
		
	} // f1

} // end class
