package com.shinhan.day03;


public class ComputerTest {

	
	public static void main(String[] args) {
		f1();

	} // main

	private static void f1() {
		Computer com1 = new Computer();
		Computer com2 = new Computer("Samsung");
		Computer com3 = new Computer("WINDOW", 100);
		Computer com4 = new Computer("LG","WINDOW", 100);
	
		System.out.println("생성된 컴퓨터 개수==>" + Computer.count);
		display(com1);
		display(com2);
		display(com3);
		display(com4);
	}

	private static void display(Computer com) {
		System.out.println("=========================");
		System.out.println(com.getModel());
		com.computerInfoprint();
		
	}

} // end class
