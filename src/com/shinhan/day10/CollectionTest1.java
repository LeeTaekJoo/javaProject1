package com.shinhan.day10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;

import com.shinhan.day04.Employee;
import com.shinhan.day05.Account;

public class CollectionTest1 {

	public static void main(String[] args) throws IOException {
		f9();

	}

	private static void f9() throws IOException {
		Properties pro = new Properties();
//		InputStream fis = new FileInputStream("src/com/shinhan/day10/OracleInfo.properties");
//		pro.load(fis);
		InputStream is = CollectionTest1.class.getResourceAsStream("OracleInfo.properties");
		pro.load(is);
		//pro.load(CollectionTest1.class.getResourceAsStream("OracleInfo.properties"));
		String driver = pro.getProperty("myname");
		System.out.println(driver);
		
		for(Object key : pro.keySet()) {
			String value = pro.getProperty((String) key);
			System.out.println(key + "---" + value);
		}
		
	}

	private static void f8() {
		// Key는 Set이다.
		// Set은 add시에 동등객체인지 확인. 동등하면 add불가
		// Map은 put()시에 key를 찾는다. 동등한것을 찾으면 replace한다.
		HashMap<Employee,Account> data = new HashMap<>();
		data.put(new Employee("용희", "대리", 1000), new Account("1234", "용희", 2000));
		data.put(new Employee("용희", "대리", 1000), new Account("5555", "용희", 5000));
		data.put(new Employee("용희2", "과장", 7000), new Account("12345", "용희2", 2000));
		data.put(new Employee("용희3", "부장", 8000), new Account("12346", "용희3", 2000));
		data.put(new Employee("용희4", "대리", 9000), new Account("12347", "용희4", 2000));
		
		for(Employee emp :data.keySet()) {
			System.out.println("key: " + emp);
			System.out.println("value: " + data.get(emp));
			System.out.println("-------------------------");
		}
		
		System.out.println("key찾기~~~~~~~~~");
		System.out.println(data.containsKey(new Employee("용희", "대리", 1000)));
		System.out.println(data.containsKey(new Employee("용희", "대리", 99999)));
		System.out.println("value찾기~~~~~~~~~");
		System.out.println(data.containsValue(new Account("12345", "용희2", 2000)));
		System.out.println(data.containsValue(new Account("12345", "용희99", 2000)));
	}

	private static void f7() {
		// Map : 키와 값의 쌍이다. (Entry), 키는 set이므로 중복불가
		// 구현class : HashMap, HashTable
		HashMap<String,Integer> data = new HashMap<>();
		data.put("이", 100);
		data.put("박", 60);
		data.put("정", 90);
		data.put("양", 50);
		data.put("이", 200);
		
		System.out.println("키가 중복되면 마지막값 유효:"+data.get("이"));
		
		// 1. 일반 for --> 불가
		// 2. 향상 for
		// entry는 1건을 의미, entrySet은 여러건을 의미
		int sum = 0;
		for(Entry<String, Integer> e:data.entrySet()) {
			System.out.println(e.getKey() + "==>" + e.getValue());
			sum += e.getValue();
		}
		System.out.println("총점 : " + sum);
		sum = 0;
		
		// keySet() : 키들을 의미
		for(String key:data.keySet()) {
			System.out.println(key + "==>" + data.get(key));
			sum += data.get(key);
		}
		System.out.println("총점 : " + sum);
		
		Iterator<String> it = data.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
			System.out.println(data.get(key)); // 다음data읽기
			System.out.println("----------------------------");
		}
		
		System.out.println("키찾기: " + data.containsKey("이"));
		System.out.println("키찾기: " + data.containsKey("김"));
		
		System.out.println("키찾기: " + data.containsValue(200));
		System.out.println("키찾기: " + data.containsValue(1));
	}

	private static void f6() {

		// Set interface => 구현class : HashSet, TreeSet
		// 순서없고 중복불가(단, Tree는 순서있음)
		Set<Account> data = new HashSet<>();
		data.add(new Account("1234", "이", 1000));
		data.add(new Account("1234", "이", 1000));
		data.add(new Account("1235", "이1", 3000));
		data.add(new Account("1236", "이2", 4000));
		data.add(new Account("1237", "이3", 5000));
		
		// 1. 일반for

		// 2. 향상for(enhanced for)
		for (Account acc : data) {
			System.out.println(acc);
		}
		
		System.out.println("=================");
		// 3. interator(내부반복자)
		Iterator<Account> it = data.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		// 원하는 객체찾기
		Account searchData = new Account("1235", "이1", 3000);
		boolean result = data.contains(searchData);
		System.out.println(result?"찾음":"못찾음");

	}

	private static void f5() {

		// Set interface => 구현class : HashSet, TreeSet
		// 순서없고 중복불가(단, Tree는 순서있음)
		Set<String> data = new HashSet<>();
		data.add("월요일");
		data.add("화요일");
		data.add("토요일");
		data.add("토요일");
		data.add("일요일");
		// 1. 일반for

		// 2. 향상for(enhanced for)
		for (String week : data) {
			System.out.println(week);
		}
		// 3. interator(내부반복자)
		Iterator<String> it = data.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	private static void f4() {

		// ArrayList는 중간의 data를 삽입하거나 삭제시 앞으로 당기는것 때문에 느리다.
		List<Account> data = new LinkedList<>();
		long start = System.nanoTime();

		for (int i = 1; i <= 100000; i++) {
			data.add(new Account(i + "", "이택주" + i, i));
		}

		for (int i = 100; i < 200; i++) {
			data.remove(0);
		}

		for (int i = 100; i < 200; i++) {
			data.add(i, new Account(i + "", "이택주" + i, i));
		}

		long end = System.nanoTime();
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println("걸리시간-->" + df.format(end - start) + "ns");

	}

	// Vector는 멀티쓰레드에 안정적... 동기화된다..
	private static void f3() {
		List<Account> data = new Vector<>();

		long start = System.nanoTime();

		// 2000번 add하고자한다. 2개의 흐름을 만들어서 각자 1000번씩 넣고자한다.
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					data.add(new Account(i + "", "이택주" + i, i));
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 1001; i <= 2000; i++) {
					data.add(new Account(i + "", "김택주" + i, i));
				}
			}
		};
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(data.size() + "건이 저장되었습니다 .....");

		for (int i = 0; i < 100; i++) {
			data.remove(0);
		}

		long end = System.nanoTime();
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println("걸리시간-->" + df.format(end - start) + "ns");

	}

	private static void f2() {
		// List interface : 구현class -> ArrayList, LinkedList, Vector
		List<String> data = new ArrayList<>();
		data.add("자바1");
		data.add("자바2");
		data.add("자바3");
		data.add("자바4");
		data.add("자바5");
		System.out.println(data.size() + "개");

		// 1. 일반 for
		for (int i = 0; i < data.size(); i++) {
			System.out.println(i + "번째 : " + data.get(i));
		}
		System.out.println("=====enhanced for=====");
		// 2. 향상 for(enhanced for)
		for (String s : data) {
			System.out.println(s);
		}
		System.out.println("=====Iterator=====");
		Iterator<String> it = data.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

	}

	// 제네릭 사용하지 않는것은 바람직하지 않다.
	private static void f1() {
		// List interface : 구현class -> ArrayList, LinkedList, Vector
		List data = new ArrayList();
		data.add(10);
		data.add("이택주");
		data.add(new Account("12345", "택", 1000));
		int a = (Integer) data.get(0);
		String s = (String) data.get(1);
		Account acc = (Account) data.get(2);
	}

}
