package com.shinhan.day03;

public class practice5 {

	public static void main(String[] args) {
		method8();
	}

	private static void method8() {
		int[][] array = {{95,86},{83,92,96},{78,83,93,87,88}};
		int sum =0;
		float avg =0;
		int count=0;
		
		for(int i=0; i<array.length;i++){
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		avg=sum/(float)count;
		System.out.println("총합==>"+sum);
		System.out.println("평균==>"+avg);
		
	}

	private static void method7() {
		int[] array = {1,5,3,8,2};
		int max = array[0];
		
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];	
			}	
		}
		System.out.println(max);
	}

	private static void method6() {
		int[][] array = {{95,86},{83,92,96},{78,83,93,87,88}};
		
		System.out.println(array.length);
		System.out.println(array[2].length);
		
	}

}
