package com.shinhan.day11;

// 함수형 표현 ... 람다식 ... 람다표현식으로 표현가능한가?@FunctionalInterface
// interface에 1개의 메서드만 존재해야한다.
@FunctionalInterface
public interface Calculable2 {

	// 추상메서드 정의
	int calculate(int x, int y);
//	void calculate2(int x, int y);
}
