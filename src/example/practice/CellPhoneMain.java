package example.practice;

class CellPhone{
	String model;
	double battery;
	
	public CellPhone(String model) {
		this.model = model;
	}
	
	void call(int time)  {
		if(time<0) {
			throw new IllegalArgumentException("통화시간입력오류");
		}
		
		battery -= (time*0.5);
		if(battery<0) {
			battery = 0;
		}
		System.out.println("통화 시간: " + time + "분");
	}
	
	void charge(int time) {
		System.out.println("충전시간: " + time + "분");
		
		try{
			battery += (time*3);
			if(battery>100) {
				battery = 100;
				throw new IllegalAccessException("충전시간입력오류");
			}
		}catch (IllegalAccessException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void printBattery() {
		System.out.println("남은 배터리 양: " + battery);
	}
	
	// override : 함수이름, 매개타입과 갯수, return타입이 모두 같아야하고, 접근제한자는 같거나 더 넓어져야한다.
	// overloading : 매개타입과 갯수가 다르면 Overloading이다.
	
	public boolean equals(Object otherObject) {
		if(otherObject instanceof CellPhone c){
			if((((CellPhone) otherObject).model).equals(model)) {
				return true;
			}else {
				return false;
			}
		}
		return true;
	}
	
} // end class



public class CellPhoneMain {

	public static void main(String[] args) { 
		CellPhone myPhone = new CellPhone("SCH-600");
		
		myPhone.charge( 20 );  //20분간 충전을 한다.
		myPhone.printBattery();
		
		myPhone.call( 300 );  //300분간 통화를 한다.
		myPhone.printBattery();
		
		myPhone.charge( 50 );  //50분간 충전을 한다.
		myPhone.printBattery();
		
		myPhone.call( 40 );  //40분간 통화를 한다.
		myPhone.printBattery();
		
		try {
			myPhone.call( -20 );  //통화시간이 잘못 입력되었다.
		} catch(IllegalArgumentException e) {
			System.out.println( e.getMessage() ); 
		} 
		
		CellPhone yourPhone = new CellPhone("SCH-600");
		
		if( myPhone.equals(yourPhone) ) {
			System.out.println("동일 모델입니다.");
		} else {
			System.out.println("다른 모델입니다.");
		} 
	}
}
