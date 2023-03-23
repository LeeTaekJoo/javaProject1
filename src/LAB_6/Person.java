package LAB_6;


public class Person {
	
	int age;
	String name;
	
	private static int numberOfPersons;
	
	Person() {
		this(12, "Anonymous");
	}
	
	Person(int age, String name){
		this.name = name;
		this.age = age;
		numberOfPersons++;
	}
	void selfIntroduce(){
		System.out.println("내 이름은 "
				+name+"이며, 나이는 "
				+age+"살 입니다.");
	}
	
	int getPopulation() {
		return numberOfPersons;
	}	
	
}
	