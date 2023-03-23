package com.shinhan.day08;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class OtherPair<K, V>  {

	private K key;
	private V value;
}
