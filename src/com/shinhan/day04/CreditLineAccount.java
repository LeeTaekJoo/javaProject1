package com.shinhan.day04;

import com.shinhan.day05.Account;

public class CreditLineAccount extends Account{
	
	

	void test() {
		System.out.println(getAccNo());
		System.out.println(getOwner());
		System.out.println(getBalance());
		deposit(100);
		withdraw(100);
	}

} // end class
