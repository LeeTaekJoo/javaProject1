package com.shinhan.day08;

import java.util.Arrays;
import java.util.Comparator;

public class SortTest {

	
	public static void main(String[] args) {
		
		f2();

	}

	private static void f4() {
		Car[] arr = {new Car("A",5000),new Car("D",500),new Car("B",2000),new Car("C",2000)};
		// System.out.println("before: "+ Arrays.toString(arr));
		print("before", arr);
		
		Arrays.sort(arr); // Comparable인터페이스를 구현하지않으면 비교불가.
		print("가격desc, 모델 asc after", arr);
		
		Arrays.sort(arr, new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				int result = o1.price - o2.price;
				
				if(result==0) return o2.model.compareTo(o1.model);
				
				return result;
			}
		}); // Comparable인터페이스를 구현하지않으면 비교불가.
		print("가격desc, 모델 desc after", arr);
		
	}

	private static void print(String title, Car[] arr) {
		System.out.println("==================" + title + "==================");
		for(Car car:arr) {
			System.out.println(car);
		}
		
	}

	private static void f3() {
		Money[] arr = {new Money(10),new Money(2),new Money(3),new Money(9),new Money(6),new Money(11)};
		System.out.println("before: "+ Arrays.toString(arr));
		Arrays.sort(arr); // Comparable인터페이스를 구현하지않으면 비교불가.
		System.out.println("after: "+ Arrays.toString(arr));
		
		
		Arrays.sort(arr, new Comparator<Money>() {

			public int compare(Money o1, Money o2) {
				
				return o2.amount-o1.amount;
			}
		}); // Comparator인터페이스를 익명구현
		System.out.println("desc: "+ Arrays.toString(arr));
		
	}

	private static void f2() {
		// 아스키 코드: 'A'==>65 'a'==>97
		String[] arr = new String[] {"Spring", "java", "jsp", "servlet", "html", "CSS", "React"};
		System.out.println("before: "+ Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("after: "+ Arrays.toString(arr));
		Arrays.sort(arr, new Comparator<String>() {
			
			public int compare(String o1, String o2) {
				
				return o2.compareTo(o1);
			}	
		});
		System.out.println("desc: "+ Arrays.toString(arr));
	}

	private static void f1() {
		Integer[] arr = new Integer[] {100,30,80,20,99};
		System.out.println("before: "+ Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("after: "+ Arrays.toString(arr));
		Arrays.sort(arr, new DecendingInteger());
		System.out.println("desc after: "+ Arrays.toString(arr));
	}

}
