package com.shinhan.day02;


public class 반복문 {

	
	public static void main(String[] args) {
		
		forTest4();

	} // main
	

	private static void forTest4() {

		// 1~10 합계
		int sum =1;
		int total = 0;
		for(; sum<=10; ++sum) {
			if(sum%2!=0)continue; // 반목문을 빠지지않고 아래문장들무시, 계속진행
				total += sum;
				
				System.out.print(sum);
				System.out.print(sum==10 ? "" : "+");
					
		}
		System.out.print("=" + total);
		
	} // forTest4


	private static void forTest() {
		// 1~10까지 출력한다.
		int i;
		for(i=1; i<=10; i++) {
			
			System.out.println(i);
			System.out.println("================");
		}
		System.out.println("method end..." + i);
	} // forTest
	
	
		private static void whileTest() {
			// 1~10까지 출력한다.
			int i=1;
			while(true) {
				if(i>10) break;
				System.out.println(i);
				System.out.println("================");
				i++;
			}
			System.out.println("method end..." + i);
		
	} // whileTest
	
	
		private static void whileTest2() {
			// 1~10까지 출력한다.
			int i=1;
			while(i<=10) {
				
				System.out.println(i);
				System.out.println("================");
				i++;
			}
			System.out.println("method end..." + i);
		
	} // whileTest2
	
	
		private static void whileTest3() {
			// 1~10까지 출력한다.
			int i=100;
			do {
				System.out.println(i);
				System.out.println("================");
				i++;
			}while(i<=10);
			System.out.println("method end..." + i);
		
	} // whileTest3


} // end class
