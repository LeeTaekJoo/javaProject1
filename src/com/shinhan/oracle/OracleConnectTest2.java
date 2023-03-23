package com.shinhan.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OracleConnectTest2 {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.println("조회하고자하는 직원이름입력>>");
		Scanner sc = new Scanner(System.in);
		String inputName=sc.nextLine();
		
		String sql = "select first_name, salary, hire_date " 
				+ "from employees "
				+ "where first_name =initCap('"
				+ inputName
				+ "')";
		
		// 1. driver load 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("1. driver load 성공");
		
		// 2. Connection
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String userid="hr",pass="hr";
		
		Connection conn = DriverManager.getConnection(url, userid, pass);
		System.out.println("2. Connection 성공");
		
		// 3. Statement를 통해서 SQL전송
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getInt(2));
			System.out.println(rs.getString(3));
			System.out.println("----------------------");
		}
		rs.close(); st.close(); conn.close(); // 자원반납

	} // main

	
} // end class
