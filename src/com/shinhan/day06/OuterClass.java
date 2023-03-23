package com.shinhan.day06;

public class OuterClass {
	// 1.field (instance field, static field)
	int a = 10;
	static int b = 20;

	// 2.생성자..default제공
	// 3.메서드(instance method, static method)
	void method1() {
		System.out.println("OuterClass...instance method");
	}

	static void method2() {
		System.out.println("OuterClass...static method");
	}

	// 4.block(instance block {}, static block : static {}
	// 5.inner class:3가지, instance, class, local
	class InstanceInnerClass {
		String s1 = "InstanceInnerClass임";
		static String s2 = "InstanceInnerClass임";

		void method3() {
			System.out.println("InnerClass...instance method");
		}

		static void method4() {
			System.out.println("InnerClass...static method");
		}
	}

	static class StaticInnerClass {
		String s1 = "InstanceInnerClass임";
		static String s2 = "InstanceInnerClass임";

		void method3() {
			System.out.println("StaticInnerClass...instance method");
		}

		static void method4() {
			System.out.println("StaticInnerClass...static method");
		}
	}

	void f1() {
		
		// LocalClass는 함수내에있는 class, static 불가
		class LocalClass {
			String s3 = "LocalClass임";
			static String s4 = "LocalClass static임";

			void method5() {
				System.out.println("LocalClass...instance method");
				System.out.println(s3);
				System.out.println(s4);
				System.out.println(a);
				System.out.println(b);
				System.out.println("---------------");
			}

			static void method6() {
				System.out.println("LocalClass...static method");
//				System.out.println(s3);
				System.out.println(s4);
//				System.out.println(a);
				System.out.println(b);
				System.out.println("---------------");
			}
		}
		LocalClass local = new LocalClass();
		System.out.println(local);
		System.out.println(LocalClass.s4);
		local.method5();
		LocalClass.method6();
	}
}