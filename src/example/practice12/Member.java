package example.practice12;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id=id;
		this.name=name;
	}

	// 구현
	@Override
	public String toString() {
		return id+": "+name;
	}

}
