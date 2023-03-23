package com.shinhan.day09;

// 공유영역
public class WorkObject {
	
	public synchronized void methodA() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+ "작업실행A...");
		
		notify(); // 다른애를 깨운다
		
		try {
			wait(); // 내가 기다린다
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void methodB() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+ "작업실행B...");
		
		notify(); // 다른애를 깨운다
		
		try {
			wait(); // 내가 기다린다
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
