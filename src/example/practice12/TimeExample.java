package example.practice12;

public class TimeExample {
	
	

	public static void main(String[] args) {
		int[] scores = new int[1000];
		
		long startTime = System.nanoTime();
		for(int i=0; i<scores.length; i++) {
			scores[i]=i;
		}
		
		int sum =0;
		for(int score : scores) {
			sum+=score;
		}
		
		double avg = sum/scores.length;
		System.out.println(avg);
		
		long endTime = System.nanoTime();
		
		System.out.println("걸린시간: "+(endTime-startTime));

	}
	
	

}
