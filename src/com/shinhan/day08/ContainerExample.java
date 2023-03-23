package com.shinhan.day08;

import example.practice12.Money;

public class ContainerExample{

	public static void main(String[] args) {
		
		f3();

	}

	private static <K,V> Container2<K,V> makeContainer(K key, V value) {
		
		return new Container2<K,V>(key, value);
	}
	
	private static void f3() {
		// 3번 문제
//		Container2<String, Integer> container1 = new Container2<>();
		Container2<String, Integer> container1 = makeContainer("aa", 100);
		
		
//		container1.set("홍길동",100);

		System.out.println("key=" + container1.getKey());
		System.out.println("value=" + container1.getValue());
		
		
		Container2<String, Money> container2 = makeContainer("택", new Money(100));
//		container2.set("홍길동",new Money(100));

		System.out.println("key=" + container2.getKey());
		System.out.println("value=" + container2.getValue());
		
	}

	private static void f2() {
		
		// 2번 문제
		Container<String> container1 = new Container<String>();
		container1.set("홍길동");
		String str = container1.get();
		System.out.println(str);
		
		Container<Integer> container2 = new Container<Integer>();
		container2.set(6);
		int value = container2.get();
		System.out.println(value);
		
		Container<Money> container3 = new Container<Money>();
		container3.set(new Money(10));
		Money m = container3.get();
		System.out.println(m);
		
	}

}
