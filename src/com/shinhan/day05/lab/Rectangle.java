package com.shinhan.day05.lab;

public class Rectangle extends Shape implements Resizable{

	double width;
	double height;
	
	Rectangle(int width, int height) {
		super(3);
		this.width = width;
		this.height = height;
				
	}

	@Override
	double getArea() {
		
		return width*height;
	}

	@Override
	double getPerimeter() {
		
		return 2*(width+height);
	}

	@Override
	public void resize(double s) {
		width = (width * s);
		height = (height * s);
		
	}
	
}
