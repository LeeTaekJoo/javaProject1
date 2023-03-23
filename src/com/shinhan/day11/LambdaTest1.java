package com.shinhan.day11;

public class LambdaTest1 {

	public static void main(String[] args) {
		f5();

	}

	private static void f5() {
		Calculable2 f = (a,b)->a+b;
		Calculable2 f3 = (a,b)-> {
			System.out.println("여러문자이라면 {} 필요");
			System.out.println("반드시 return문이 온다");
			return a+b;
		};
		int result1 = f.calculate(1, 2);
		int result2 = f3.calculate(1, 2);
		System.out.println(result1);
		System.out.println(result2);
		
	}

	private static void f4() {
		Person p1 = new Person();
		p1.action1(new Workable() {

			@Override
			public void work(String name, String job) {
				System.out.println("이름은 " + name);
				System.out.println("job = " + job);
				System.out.println("-----------------");
			}
		});
		// 람다 표현식
		p1.action1((a, b) -> System.out.println(a + "--" + b));
		p1.action1((a, b) -> {
			System.out.println(a + "^^^^" + b);
			System.out.println(a + "****" + b);

		});
		Workable f = (a, b) -> {
			System.out.println(a + "@@@@" + b);
			System.out.println(a + "!!!!" + b);
		};
		p1.action1(f);
		
		p1.action2(s->System.out.println(s+"말하기"));
		
	

	}

	private static void work(Runnable r) {
		Thread t1 = new Thread(r);
		t1.start();
	}

	private static void f3() {
		work(() -> {
			System.out.println("A");
		});
		work(() -> {
			System.out.println("B");
		});
		work(() -> {
			System.out.println("C");
		});
		work(() -> {
			System.out.println("D");
		});

	}

	private static void action(Calculable func) {
		func.calculate(10, 20);
	}

	private static void f2() {
		// 1. 구현class이용 ... x
		// 2. 익명구현class이용 ... o
		/*
		 * (new Calculable() { public void calculate(int x, int y) {
		 * System.out.println("------익명구현class-----"); System.out.println("더하기: " +
		 * (x+y));
		 * 
		 * } }).calculate(10, 20);
		 */
		Calculable f1 = new Calculable() {
			public void calculate(int x, int y) {
				System.out.println("------익명구현class-----");
				System.out.println("더하기: " + (x + y));

			}
		};

		Calculable f2 = new Calculable() {
			public void calculate(int x, int y) {
				System.out.println("------익명구현class-----");
				System.out.println("빼기: " + (x - y));

			}
		};

		Calculable f3 = (a, b) -> {
			System.out.println("------람다표현식이용------");
			System.out.println("곱하기: " + (a * b));
		};

		action(f1);
		action(f2);
		action(f3);

	}

	private static void f1() {
		// 1. 구현class 이용
		MyInterface a = new MyClassImplement();
		a.print();

		// 2. 익명 구현class 이용
		(new MyInterface() {

			@Override
			public void print() {
				System.out.println("익명구현 class이용1 ....");
			}
		}).print();

		MyInterface b = new MyInterface() {

			@Override
			public void print() {
				System.out.println("익명구현 class이용2 ....");
			}
		};
		b.print();

		// 3. 람다식이용 .. JS: 화살표함수 =>
		MyInterface c = () -> System.out.println("람다식 이용 ....");
		c.print();

	}

}
