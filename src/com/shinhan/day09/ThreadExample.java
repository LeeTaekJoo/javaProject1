package com.shinhan.day09;

class MovieThread extends Thread{
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println("동영상");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MusicThread implements Runnable{
	public void run() {
		for(int i=1; i<=3; i++) {
			System.out.println("음악");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadExample {
	
	public static void main(String[] args) {
		Thread thread1 = new MovieThread();
		thread1.start();
		
		Thread thread2 = new Thread(new MusicThread());
		thread2.start();
		
		Thread thread3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		thread3.start();
	}

}
