package com.shinhan.day03;

public class EnumTest {

	// 상수 : 고정값
	final static double PI = 3.141592;
	final static int MONDAY = 1;
	final static int SUNDAY = 2;
	static final int SUCCESS = 2;
	
	
	public static void main(String[] args) {
		
//		f2(LoginEnum.SUCCESS);
//		f3();
//		f5();

	} // main	

	private static String f5(WeekEnum week) {
		switch (week) {
		String result = null;
		case MONDAY: result = "월요일"; break;
		case THURSDAY: result = "화요일"; break;
		case WEDNESDAY: result = "수요일"; break;
		case THURSDAY: result = "목요일"; break;
		case FRIDAY: result = "금요일"; break;
		case SATURDAY: result = "토요일"; break;
		case SUNDAY: result = "일요일"; break;
		
		default :
			break;
	
		}
		
	}

	private static void f3() {
		WeekEnum[] weeks=WeekEnum.values();
		for(WeekEnum week : weeks) {
			System.out.println(week.ordinal()+"=>"+week.name());
			String weekName=f4(week);
			System.out.println(weekName);
			System.out.println("*********************");
		}
		
	}

	private static String f4(WeekEnum week) {
		String result = null;
		if(week == WeekEnum.MONDAY) {
			result = "월요일";
		}else if(week == WeekEnum.THURSDAY){
			result = "화요일";
		}else if(week == WeekEnum.WEDNESDAY){
			result = "수요일";
		}else if(week == WeekEnum.THURSDAY){
			result = "목요일";
		}else if(week == WeekEnum.FRIDAY){
			result = "금요일";
		}else if(week == WeekEnum.SATURDAY){
			result = "토요일";
		}else if(week == WeekEnum.SUNDAY){
			result = "일요일";
		}
		return result;
	}

	private static void f2(LoginEnum login) {
		System.out.println(login == LoginEnum.SUCCESS);
		System.out.println(login == LoginEnum.FAIL);
		
		LoginEnum[] arr = LoginEnum.values();
		for(LoginEnum aa:arr) {
			System.out.println(aa.ordinal() + "==" + aa.name());
		}
		
	}

	private static void f1() {
		System.out.println(PI);
		int input = 2;
		System.out.println(input == SUNDAY );
	}

	
} // end class
