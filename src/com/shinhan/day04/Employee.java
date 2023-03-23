package com.shinhan.day04;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
	
	private String name;
	private String title;
	private int baseSalary;
	private int totalSalary;
	
	public Employee(String name, String title, int baseSalary){
		this.name = name;
		this.title = title+"님 ";
		this.baseSalary = baseSalary;
		getTotalSalary();		
		
	}
	
	public void getTotalSalary() {
		if(title.equals("부장")) {
			totalSalary=(int)(baseSalary+baseSalary*0.25);
		}else if(title.equals("과장")){
			totalSalary=(int)(baseSalary+baseSalary*0.15);
		}else {
			totalSalary=(int)(baseSalary+baseSalary*0.05);
		}
	}

	public void print() {
		System.out.println(
				 title +"직급의 "
				+ name+ "씨의 본봉은"
				+ baseSalary+"원이고 총급여는 "
				+ totalSalary+" 원입니다.");
		
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", title=" + title + ", baseSalary=" + baseSalary + ", totalSalary="
				+ totalSalary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(baseSalary, name, title, totalSalary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return baseSalary == other.baseSalary && Objects.equals(name, other.name) && Objects.equals(title, other.title)
				&& totalSalary == other.totalSalary;
	}

	@Override
	public int compareTo(Employee emp) {
		
		int result = name.compareTo(emp.name)*-1;
		int result2 = name.compareTo(emp.name)*-1;
		if(result2==0) return title.compareTo(emp.title);
		if(result==0) return result2;
		return result;
		
		//return name.compareTo(emp.name); // 어센딩
		//return name.compareTo(emp.name)*-1; // 디센딩
		
	}
	
	
	
} // end class
