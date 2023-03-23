package com.shinhan.day05;

// Child2 ch = new Child() : Object생성 -> Parent2생성 -> Child2생성
// ch.a
// ch.method1

// final class : 상속 불가
// final field : 값 수정 불가
// final method : 재정의 불가
class Parent2 extends Object{
	int a = 10;
	Parent2(){
		//super();
		System.out.println("부모생성자");
	}
	void method1() {
		System.out.println("부모 method");
	}

class Child2 extends Parent2{
//	String a = "자바"; // 덮어쓰기됨(Override)
	int b = 20;
	Child2(){
		//super();
		System.out.println("자식생성자");
	}
	void method1() {
		System.out.println("자식 method1");
	}
	void method1(String b) { // 추가(Overloading)
		System.out.println("자식 method1");
	}
	void method2() {
		System.out.println("자식 method2");
	}
		
	}
}


public class InheritenceTest2 {

	public static void main(String[] args) { 
		f3();

	} // main

	private static void f3() {
		Parent2 ch = new Parent2();
		System.out.println(ch.a + ch.b);
		ch.method1();
//		ch.method2();
		
	}

	private static void f2() {
//		Child2 ch = new Child2();
		System.out.println(ch.a + ch.b);
//		ch.method1();
//		ch.method2();
		
	}

	private static void f1() {
		Student st1 = new Student("123","이택주");
		Student st2 = new Student("1234", "김택주", "컴공");
		Student st3 = new Student("12345", "양택주", "자동차", 100);
		ExchangeStudent st4 = new ExchangeStudent("123458", "택수", new String[] {"영어","프랑스"});
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(st4);
		System.out.println(Student.count + "명");
	} // f1

} // end class
