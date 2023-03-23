package com.shinhan.day02;

import java.util.Arrays;

public class ReferenceTest {

	public static void main(String[] args) {
		f4();

	} // main

	private static void f4() {
		String subjects = "자바,DB,HTML,CSS,JavaScript,React,Spring";
		String[] arr = subjects.split(",");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[6]);
		for(String s :arr) {
			System.out.println(s);
		}
	}

	private static void f3() {
		// String은 고정문자열이다.
		String subject = "이것이 자바다~";
		for(int index=0; index<subject.length(); index++) {
//			System.out.println(subject.charAt(index));
			System.out.println(subject.substring(index, index+1));
		}
		System.out.println(subject.replace("이", "AA"));
		System.out.println(subject);
		subject = subject.replace("이","BB");
		System.out.println(subject);
		System.out.println(subject.indexOf("바다")); // 위치
	}

	private static void f2() {
		String name = null;	// null은 힙에 생성된 객체는 없다
		System.out.println(name);
		System.out.println(name.length());
		
	} // f2

	private static void f1() {
		int a = 10;
		String s1 = "자바"; // compile시에 상수pool, load시에 method영역에 상수pool
		String s2 = "자바"; // compile시에 상수pool, load시에 method영역에 상수pool
		String s3 = new String("자바");
		String s4 = new String("자바");
		
		System.out.println(s1==s2); // 주소가 같다
		System.out.println(s3==s4); // 주소가 다르다
		
		s1 = s1 + "aa";
		s2 = s2 + "aa";
		System.out.println(s1==s2); // 주소가 다르다.
		
		System.out.println(s3.equals(s4)); // 문자열 비교
	} // f1

} // end class
