package exam;

class Prob3 {
	public static void main(String args[]){
		PhoneCharge skt = new PhoneCharge("김현우", 100, 50, 1);
		PhoneCharge ktf = new PhoneCharge("신희만", 200, 100, 2);
		PhoneCharge lgt = new PhoneCharge("조유성", 150, 500, 10);
		skt.printCharge();
		ktf.printCharge();
		lgt.printCharge();
	}
}

class PhoneCharge{	
	//구현하시오.
	private String user;
	private int call;
	private int sms;
	private int data;
	private int total;
	
	public PhoneCharge(String user, int call, int sms, int data) {
		super();
		this.user = user;
		this.call = call;
		this.sms = sms;
		this.data = data;
		
	}
	
	public int calcCharge() {
		int total;
		int callFee;
		int smsFee;
		int dataFee;
		
		callFee = 10*call;
		if(callFee>=200) 
		
		return total;
		}
		

	void printCharge() {
		System.out.println(user+"사용자는 이번달에 사용하신 전화요금이 "+calcCharge()+"입니다.");
	}
		
}
 