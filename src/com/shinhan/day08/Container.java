package com.shinhan.day08;

public class Container<T> {
	
	T data;
	
	public void set(T data) {
		this.data = data;
	}
	
	public T get() {
		return data;
	}

}
