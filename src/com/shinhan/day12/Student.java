package com.shinhan.day12;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter @Setter
@ToString
public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private int engScore;
	private int mathScore;
}
