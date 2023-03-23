package exam;


//문제1. 매개변수로 받은 문자배열에서 점수가 가장 큰 학생의 이름과 점수를 출력하는 메소드를 
//구현하시오. (배열에 저장된 정보는 수정될 수 있음을 고려하시오.)  

public class Prob1 {
	public static void main(String[] args) {
		String[] array={"황남기85점","조성호89점","한인성88점","독고정진77점"};
		printMaxScore(array);
		
		
		
	}	
	private static void printMaxScore(String[] array){
		
		// 구현하세요.
		int maxScore=-1;
		String maxName="";
		
		for(String str:array) {
			System.out.println(str);
			char[] charArr = str.toCharArray();
			String name="";
			String score="";
			for(int i=0; i<charArr.length-1; i++) {
				if(Character.isDigit(charArr[i])) {
					score += charArr[i];
				}else {
					name += charArr[i];
				}
			}
			int s = Integer.parseInt(score);
			if(Integer.parseInt(score) > maxScore) {
				maxScore = s;
				maxName = name;
			}
//			System.out.println(name + "====" + score);
		}
		System.out.println("최고점수는 "+maxName+"님"+maxScore+"점 입니다." );

	}	
}

