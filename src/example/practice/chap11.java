package example.practice;

public class chap11 {

	public static void main(String[] args) {
		
		chap11_07();

	}
	
	public class NotExistIDException extends Exception{
		public NotExistIDExceotion() {}
		public NotExistIDExceotion(String message) {
			
		}
	}
	public static void chap11_07() {
		try {
			login("white","12345");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue","54321");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws NotExistIDException{
		
		if(!id.equals("blue")) {
			throw NotExistIDException;
		}
	}
	// 11장 6번
	private static void chap11_06() {
		String[] strArray = {"10","2a"};
		int value = 0;
		for(int i=0; i<=2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했음");
			}catch (NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음");
			}finally {
				System.out.println(value);
			}
		}
	}
	
	// 출력결과
//	10
//	숫자로 변활할 수 없음
//	10
//	인덱스를 초과했음
//	10
	

}
