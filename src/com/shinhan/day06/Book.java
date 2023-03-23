package com.shinhan.day06;


public class Book implements Colorable{
	
	String title;
	String foregroundColor;
	String backgroundColor;

	@Override
	public void setForeground(String color) {
		foregroundColor = color;
		System.out.println("Book의 setForeground변경-->"+ color);
		System.out.println("Book의 title-->"+title);
		System.out.println("------------------------------------");
		
	}

	@Override
	public void setBackground(String color) {
		backgroundColor = color;
		System.out.println("Book의 setBackground변경-->"+ color);
		System.out.println("------------------------------------");
		
	}
	

}
