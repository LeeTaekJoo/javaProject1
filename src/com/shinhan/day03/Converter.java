package com.shinhan.day03;

public class Converter {
	public static void main(String[] args) {
		System.out.println("문자열에 특정문자 변경하는 테스");
		System.out.println("-------------Sample 1 --------------");
		String str1=myReplace("hello world",'l','*');
		System.out.println(str1);
		
		System.out.println("-------------Sample 2 --------------");
		String str2=myReplace("hello world",' ','-');
		System.out.println(str2);
		
		System.out.println("-------------Sample 3 --------------");
		String str3=myReplace("hello world",'a','*');
		System.out.println(str3);
		

	} // main
	
	// 함수 : 문장의 묶음
	// 함수생성이유 : 반복코드없이 함수로 만들어서 재사용한다. 모듈화	
	public static String myReplace(String str, char oldChar, char newChar){
		// 이 부분을 구현하시오.
		String result = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==oldChar) {
				result += newChar; // 신규문자
			}else {
				result += oldChar; // 본래문자
			}
		}
		
		
		return result;
		
			 
	}// myReplace
} // end class

