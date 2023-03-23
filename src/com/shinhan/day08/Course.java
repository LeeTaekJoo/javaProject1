package com.shinhan.day08;

public class Course {
	public static void registerCourse1(Applicant<?> appllicant) {
		System.out.println(appllicant.kind.getClass().getSimpleName() + "이  등록한 과정임 ... 모두");
	}
	
	public static void registerCourse2(Applicant<? extends Student> appllicant) {
		System.out.println(appllicant.kind.getClass().getSimpleName() + "이  등록한 과정임 ... Student, High, Middle");
	}
	
	public static void registerCourse3(Applicant<? super Worker> appllicant) {
		System.out.println(appllicant.kind.getClass().getSimpleName() + "이  등록한 과정임 ... Worker, Person");
	}
}
