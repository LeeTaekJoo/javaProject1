package com.shinhan.day03;

public class Account {
	
	private String accNo;
	private int balance;
	
	Account(String accNo, int balance){
		this.accNo = accNo;
		this.balance=balance;
	}
	
	void deposit(int amount) {
		balance += amount;
		print("계좌에 "
				+amount+"원이 "
				+ "입급되었습니다");
	}
	void withdraw(int amount) {
		balance -= amount;
		print("계좌에 "
				+amount+"원이 "
				+ "출금되었습니다");
	}
	
	//getter
	public int getBalance(){
		return balance;
	}
	public String getAccNo(){
		return accNo;
	}
	
	private void print(String message) {
		System.out.println(accNo + message);
		System.out.println("계좌의 잔고는"
				+balance+"원"
				+ " 입니다");
	}
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + "]";
	}

	public static void main(String[] args) {
		Account acc = new Account("078-3762-293", 1000000);
		acc.deposit(2000000);
		acc.withdraw(500000);
		
		System.out.println(acc);
	}
}
