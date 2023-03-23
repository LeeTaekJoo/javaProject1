package com.shinhan.day05;

// abstract class --> 추상메소드를 1개이상 가지고있다
// 직접 생성 불가 .. new Shape() 불가
// 추상클래스를 상속받은 자식class를 이용해서 객체생성가능
public abstract class Shape {

	private String color;
	private String type;
	
//	public Shape() {}
	
	public Shape(String color, String type)
	{
		this.color = color;
		this.type = type;
	}
	
	public String getColor()
	{
		return color;
	}
	public String getType()
	{
		return type;
	}
	
	// abstract 메서드 --> 정의는 있고 구현은 상속받은자식클래스에서 반드시한다.(override)
	public abstract double calculateArea(); 
	
	public abstract double calculatePerimeter(); 
	
	public String toString()
	{
		return color + " " + type;
	}


}
