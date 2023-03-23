package com.shinhan.day09;

// @AllArgsConstructor
public class TransferThread extends Thread{

	ShareArea share;
	
	// 생성자
	public TransferThread(ShareArea share) {
		this.share = share;
	}
	
	@Override
	public void run(){
		for(int i=1; i<=12; i++) {
			
			share.transfer();
		}
	}
	
} // end class
