package com.shinhan.day01;

class Account{
	int amount=1000;
	String accNo;
	
	Account(String accNo){this.accNo=accNo;}
	
	public void save(int amount) {
		System.out.println(this.amount + amount);
	}
}



public class Customer {

	public static void main(String[] args) {
		Account account = new Account("112-18845-120-999");
		account.save(5000);

	}

}
