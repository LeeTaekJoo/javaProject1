package com.shinhan.day05;

public class AccountTest {

	public static void main(String[] args) {
		f3();

	} // main

	private static void f3() {
		CheckingAccount acc = new CheckingAccount("112-1888","TAEK",1000,"33333");
		
		acc.deposit(2000); // 입금
		int amount = acc.withdraw(3500); // 출금
		System.out.println(amount + " 출금");

		System.out.println("잔액은 ==> " + acc.getBalance());
		
	}

	private static void f2() {
		CheckingAccount acc = new CheckingAccount("112-1888","TAEK",1000,"33333");
		
		acc.deposit(2000); // 입금
		int amount = acc.withdraw(100); // 출금
		System.out.println(amount + " 출금");
		
		amount = acc.pay("33333",100); // 출금
		System.out.println(amount + " 출금");
		System.out.println("잔액은 ==> " + acc.getBalance());
		
		
	}

	private static void f1() {
		Account acc = new Account("112-1888","TAEK",1000);
		
		acc.deposit(2000); // 입금
		int amount = acc.withdraw(100); // 출금
		System.out.println(amount + " 출금");
		
	} // f1

} // end class
