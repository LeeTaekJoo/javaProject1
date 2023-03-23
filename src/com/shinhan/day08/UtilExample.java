package com.shinhan.day08;



public class UtilExample {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println("pair 나이는: "+ age);
		
		
		ChildPair<String, Integer> childPair = new ChildPair<>("이택주", 27);
		Integer childAge = Util.getValue(childPair, "홍삼순");
		System.out.println("childAge 나이는: "+ childAge);

	}

}
