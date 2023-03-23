package com.shinhan.day06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Exception(예외) --> 프로그래머의 노력으로 프로그램이 중단되지않고 계속진행할수있다.
public class ExceptionClass {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		System.out.println("main start~");
		f6();
		System.out.println("main end~");
	}

	private static void f6() throws ClassNotFoundException {
		Class cls = Class.forName("com.shinhan.day06.Book");
		System.out.println(cls.getSimpleName());
		
	}

	private static void f5() throws IOException{
		// 일반Exception : 컴파일시점에 반드시 해결해야한다.
		// 2. 이 함수를 호출한곳에 떠넘긴다.
		FileReader fr = new FileReader("src/com/shinhan/day06/Book.java");
		int i;
		while((i = fr.read())!=-1) {
			System.out.print((char)i);
		}
	}

	private static void f3() {
		// 일반 Exception : 컴파일시점에 반드시 처리해야한다.
		// 1. 내가한다 2. 떠넘긴다		
		FileReader fr = null;
		int i;
		try {
			fr = new FileReader("src/com/shinhan/day06/Book.java");
			try {
				while((i = fr.read())!=-1) {
					System.out.print((char)i);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch(NullPointerException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void f4() {
		// 일반 Exception : 컴파일시점에 반드시 처리해야한다.
		// 1. 내가한다 2. 떠넘긴다		

		int i;
		try {
			 // 자동 자원삭제
			try(FileReader fr = new FileReader("src/com/shinhan/day06/Book.java")) {
				while((i = fr.read())!=-1) {
					System.out.print((char)i);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}finally {
			
		} 
		
	}

	private static void f2() {
		try {
			int a=10;
			int b=0;
//			System.out.println(a/b);
			
			int[] arr = new int[5];
//			System.out.println(arr[5]);
			
			Object obj = new Object();
			System.out.println(obj.toString());
//			String s = (String)obj;
//			System.out.println(s.length());
			
			String su = "100점";
//			int total = Integer.parseInt(su) + 200;
//			System.out.println(total);
			
			String s2 = null;
			System.out.println(s2.length());
			
			
		}catch(ArithmeticException e) {
//			e.printStackTrace(); // 오류과정출력
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace(); // 오류과정출력
			System.out.println(e.getMessage());
		}catch(ClassCastException e) {
//			e.printStackTrace(); // 오류과정출력
			System.out.println(e.getMessage());
		}catch(NumberFormatException e) {
//			e.printStackTrace(); // 오류과정출력
			System.out.println(e.getMessage());
		}catch(Exception e) { // catch는 하위먼저, 상위 나중에 작성한다.
			e.printStackTrace(); 
			System.out.println(e.getMessage());
		}finally {
			System.out.println("이 부분은 반드시처리한다... 자원반납코드를 쓴다. dbdisconnect, fileClose");
		}
		
	}

	private static void f1() {
		// 실행예외: 컴파일시에 오류없음, 실행시 오류
		// 기타예외: 컴파일시에 반드시 처리해야한다.
		
		// 1. ArithmeticException
		int a=10;
		int b=0;
//		System.out.println(a/b);
		
		// 2. ArrayIndexOutOfBoundsException
		int[] arr = new int[5];
//		System.out.println(arr[5]);
		
		// 3. ClassCastException
		Object obj = new Object();
		System.out.println(obj.toString());
//		String s = (String)obj;
//		System.out.println(s.length());
		
		// 4. NumberFormatException
//		String su = "100점";
//		int total = Integer.parseInt(su) + 200;
//		System.out.println(total);
		
	}

}
