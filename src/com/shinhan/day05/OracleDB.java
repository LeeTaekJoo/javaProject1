package com.shinhan.day05;


public class OracleDB extends Object implements JDBCInterface{

	@Override
	public void dbConnect(String dbName) {
		System.out.println("상수접근=>"+JDBC);
		System.out.println("상수접근=>"+JDBC2);
		// default 메서드 호출
		select();
		// static 메서드 호출
		JDBCInterface.update();
		// private는 호출불가
//		JDBCInterface.insert();
		
	}
	
//	public void select() {
//		System.out.println("select 재정의가 가능하다");
//	}

	@Override
	public void dbConnect2(String dbName) {
		System.out.println(dbName+ "OracleDB dbConnect2");
		
	}
	
	
	

} // end class
