package example.practice;

public class chap07 {

	public static void main(String[] args) {
//		ChildExample07();
//		SnowTire08();
//		chap07_09();
		chap07_12();
			
	}
	
	// 7장 12번
	public static void chap07_12() {
		action(new A12());
		action(new B12());
		action(new C12());
		
	}

	public static void action(A12 a) {
		a.method1();
		if(a instanceof C12 c) {
			c.method2();
		}
	}
	
	public static class A12 {
		public void method1() {
			System.out.println("A-method1()");
		}
	}
	
	public static class B12 extends A12{
		public void method1() {
			System.out.println("B-method1()");
		}
	}
	
	public static class C12 extends A12{
		public void method1() {
			System.out.println("C-method1()");
		}
		
		public void method2() {
			System.out.println("C-method2()");
		}
	}
	// 정답 : a instanceof C c


	// 7장 11번
	public static class Activity{
		public void onCreate(){
			System.out.println("기본적인 실행 내용");
		}
	}
	
	public static class MainActivity extends Activity{
		
		@Override
		public void onCreate() {
			super.onCreate();
			System.out.println("추가적인 실행 내용");
		}
	}
	// 정답 : super
	
	
	// 7장 10번
	public abstract class Machine{
		public void powerOn() {}
		public void powerOff() {}
		public abstract void work();
		}
	
	public class Computer extends Machine{

		@Override
		public void work() {	
		}
	}
	// 정답 : 자식클래스에서 work메소드를 재정의 하지 않았다.
	
	
	// 7장 9번
	private static void chap07_09() {
		B b1 = new B();
//		B b2 = (B)new A(); // java.lang.ClassCastException
		B b3 = new D();
		B b4 = new E();
		
		method(new B());
//		method((B)new A()); // java.lang.ClassCastException
		method(new D());
		method(new E());
	}
	
	public static void method(B b) {}
		static class A{}
		static class B extends A{}
		static class C extends A{}
		static class D extends B{}
		static class E extends B{}
		static class F extends C{}		
	// 정답 : 2번 (B)new A()
	

	// 7장 8번
	public static void SnowTire08() {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
		
	}

	public static class Tire{
		public void run() {
			System.out.println("일반 타이어가 굴러갑니다유~");
		}
	} // Tire
	
	public static class SnowTire extends Tire{
		@Override
		public void run() {
			System.out.println("스노우 타이어가 굴러갑니다~");
		}
	}
	
//	출력결과
//	스노우 타이어가 굴러갑니다~
//	스노우 타이어가 굴러갑니다~


	// 7장 7번
	public static void ChildExample07() {
		Child07 child = new Child07(); 	
		
	}

	public static class Parent07{
		public String nation;
		
		public Parent07() {
			this("대한민국");
			System.out.println("Parent07() call");
		}
		
		public Parent07(String nation) {
			this.nation=nation;
			System.out.println("Parent07(String nation) call");
		}
	} // Parent07
	
	public static class Child07 extends Parent07{
		public String name;
		
		public Child07() {
			this("홍길동");
			System.out.println("Child() call");
		}
		
		public Child07(String name) {
			this.name=name;
			System.out.println("Child(String name) call");
		}
	}
//	정답
//	1. Parent07(String nation) call
//	2. Parent07() call
//	3. Child(String name) call
//	4. Child() call
	
	
	// 7장 6번
	public class Parent06{
		public String name;
		
		public Parent06(String name) {
			this.name=name;
		}
	} // Parent06
	
	public class Child06 extends Parent06{
		public int studentNo;
		
		public Child06(String name, int studentNo) {
			
//			this.name = name;
			super(name);	// 정답
			this.studentNo=studentNo;
		}
	} // Child06

} // end class
