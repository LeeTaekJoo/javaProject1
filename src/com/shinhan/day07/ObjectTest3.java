package com.shinhan.day07;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Properties;

// 명령행 매개변수 > java ObjectTest3 100 200
public class ObjectTest3 {

	public static void main(String[] args) {

		f5();
		
		System.out.println("main end");

	}

	private static void f5() {
		String os = System.getProperty("os.name");
		System.out.println(os);
		
		Properties ps = System.getProperties();

		for(Object key:ps.keySet()) {
			System.out.println("key: "+key);
			String value = System.getProperty((String)key);
			System.out.println("value: "+value);
		}
	}

	private static void f4() {
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i<1000000000; i++) {
			
		}
//		long endTime = System.currentTimeMillis();
		long endTime = System.nanoTime();
		System.out.println("걸린시간: " + (endTime=startTime));
	}

	private static void f3(String[] arr) {
		if(arr.length==0) {
			// 1. 함수빠지기
//			System.out.println("명령행 매개변수가 없다.");
//			return;
			
			// 2. 프로그램 당장 종료
			System.exit(0);
		}
		System.out.println("매개변수 : " + Arrays.toString(arr));
	}

	private static void f2() throws IOException {
		// 표준입력(default : 키보드)		
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		int i;
		while((i=ir.read()) != 13) {
			System.out.println((char)i);
		}
		
	}

	private static void f1() {
		// System class
		// 1. 표준출력(모니터출력)
		// 2. err
		// 3. in : 표준 입력
		PrintStream ps = System.out;
		ps.print(false);
		ps.printf("%10d",100); // 오른쪽 정렬
		ps.printf("%-10d",100); // 왼쪽 정렬
		ps.println("자바");
		ps.println("-------------");
		
	}

}
