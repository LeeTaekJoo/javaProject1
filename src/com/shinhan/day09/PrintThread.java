package com.shinhan.day09;

// @AllArgsConstructor
public class PrintThread extends Thread{

	ShareArea share;
	
	// 생성자
	public PrintThread(ShareArea share) {
		this.share = share;
	}
	
	@Override
	public void run(){
		for(int i=1; i<=3; i++) {
				
			share.printBalance();
		}
	}
	
} // end class
