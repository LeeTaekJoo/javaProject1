package com.shinhan.day07;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ObjectTest5 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		f7();

	}
	
	private static void f7() throws IOException {
		InputStream is = ObjectTest5.class.getResourceAsStream("CellPhoneMain.class");
		int i;
		while((i = is.read())!=-1) {
			System.out.print((char)i);
		}
		is.close();
		
		URL url2 = ObjectTest5.class.getResource("car.jpg");
		System.out.println(url2.getPath());
		
	}

	private static void f6() throws IOException {
		FileReader fr = new FileReader("src/com/shinhan/day07/CellPhoneMain.java");
		int i;
		while((i = fr.read())!=-1){
			System.out.print((char)i);
		}
	}

	private static void f5() throws ClassNotFoundException {
		// 1
		Class cls1 = CellPhone.class;
		// 2
		Class cls2 = Class.forName("com.shinhan.day07.CellPhone");
		CellPhone phone = new CellPhone("AA");
		// 3
		Class cls3 = phone.getClass();
		
		Method[] ms = cls1.getDeclaredMethods();
		for(Method m:ms) {
			System.out.println(m.getName());
			System.out.println(m.getParameterCount()+"개 파라미터");
		}
		
//		Field[] fs = cls1.getDeclaredFields();
//		System.out.println(fs.length);
//		for(Field f:fs) {
//			System.out.println(f.getName());
//			System.out.println(f.getType().getSimpleName());
//		}
		
//		Constructor[] cons = cls1.getDeclaredConstructors();
//		for(Constructor co:cons) {
//			System.out.println(co.getModifiers());
//		}
	}

	private static void f4() {
		String p1 = "([A-Za-z0-9]+)@(\\w+)\\.\\w+";
		String data = "연락처1: 11ltj12@naver.com 연락처2: aaa@naver.com";
		Pattern pattern = Pattern.compile(p1);
		Matcher matcher = pattern.matcher(data);
		
		while(matcher.find()) {
//			System.out.println(matcher.group());
			System.out.println(matcher.group(1));
			System.out.println(matcher.group(2));
			System.out.println("-----------------");
		}
		
	}


	private static void f3() {
		String p1 = "010-([0-9]{3,4})-\\d{4}";
		String data = "010-1234-6998 이곳으로 연락바람 010-5878-9845 혹은 010-8888-7777";
		Pattern pattern = Pattern.compile(p1);
		Matcher matcher = pattern.matcher(data);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
			System.out.println(matcher.group(1));
		}
		
	}

	private static void f2() {
		String p1 = "[A-Za-z0-9]+@\\w+\\.\\w+";
		String data = "11ltj12@naver.com";
		boolean result = Pattern.matches(p1, data);
		
		System.out.println(result?"OK":"NO");
		
	}

	private static void f1() {
		String p1 = "010-[0-9]{3,4}-\\d{4}";
		String data = "010-1224-5678";
		boolean result = Pattern.matches(p1, data);
		
		System.out.println(result?"OK":"NO");
	}

}
