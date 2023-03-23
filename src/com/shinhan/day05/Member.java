package com.shinhan.day05;


public class Member {
	// 13번
	String name;
	String id;
	String password;
	int age;
	// 14번
	Member user1 = new Member("홍길동", "hong");
	
	Member(String name, String id){
		this.name = name;
		this.id = id;
	}
}

