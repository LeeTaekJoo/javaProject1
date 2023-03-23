package com.shinhan.day08;

import lombok.Getter;

@Getter
public class Container2<K,V> {
	
	K key;
	V value;
	
	
//	public K getKey() {
//		return key;
//	}
	public void set(K key, V value) {
		this.key = key;
		this.value = value;
	}


	public Container2(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
//	public V getValue() {
//		return value;
//	}
	
	

}
