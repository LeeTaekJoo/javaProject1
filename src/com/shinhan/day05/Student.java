package com.shinhan.day05;

// 접근권한 : public, protected, 생략, private --> 이것들중 하나 선택.
// 활용방법 : static, final 여러개 선택
public class Student extends Object{
	
	// 1. field ==> 데이터를 저장하기위한 변수들 정의 : instance변수(각자 다 다르다), static변수(같이 사용되는 변수)
	private String stdId; // private : Student class내에서만 접근가능
	public String name;	  // public : 모든 package에서 접근가능
	String major;		  // 생략 : 같은 package에서 접근가능
	protected int score;  // protected : 같은 package에서 접근가능, 다른 package이면 자식은 접근가능
	final String schoolName="연세대"; // final : 초기화가 1회 (선언시, 생성시)
	static final String NATION="대한민국"; // static final : 상수, class 변수, 초기화가 1회(선언시)
	public static int count;	// class변수
	
	// 기본(default) 생성자 --> default생성자는 컴파일시에 자동으로 .class에 추가된다. 재정의하면 생성안됨
	public Student(String stdId, String name) {
		this(stdId, name, null, 0);
		
	} // Student
	public Student(String stdId, String name, String major) {
		this(stdId, name, major, 0);
		
	} // Student
	public Student(String stdId, String name, String major, int score) {
		super(); // 상위에 있는 Object를 생성
		this.stdId = stdId;
		this.name = name;
		this.major = major;
		this.score = score;
		count++;
	}
	
	public String getStdId() {
		return stdId;
	}
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Student.count = count;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public static String getNation() {
		return NATION;
	}
	@Override
	public String toString() {
		return "Student 정보 [stdId=" + stdId + ", name=" + name + ", major=" + major + ", score=" + score + ", schoolName="
				+ schoolName + "]";
	}
	
	
	
} // end class



