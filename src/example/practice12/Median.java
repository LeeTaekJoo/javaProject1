package example.practice12;

import java.util.Arrays;

public class Median {
	public static void main(String[] args) {
		Median median = new Median();
		int[] values1 = { 10, 4, 53, 63, 17, 37, 52, 16, 33, 65 };
		System.out.println("input : "+Arrays.toString(values1));
		System.out.println("median : "+median.findMedian(values1));
		System.out.println("===============================");
		
		int[] values2 = { 32, 53, 52, 76, 15, 98, 76, 65, 36, 10 };
		System.out.println("input : "+Arrays.toString(values2));
		System.out.println("median : "+median.findMedian(values2));
	}

	public int findMedian(int[] values) {
		int sum=0;
		int avg=0;
		int median=0;
		
		
		for(int i=0; i=Math.abs()) {
			
		}
		

		 
	}
}

//-	중간 값이란 평균값에 제일 가까운 값을 말합니다.
//-	중간 값이 여러 개 일 경우, 작은 수를 리턴 합니다.

