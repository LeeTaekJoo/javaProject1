package example.practice12;

public class OverridingTest {

	public static void main(String[] args) {
        int i = 10;
        int j = 20;
        
        MySum ms1 = new MySum(i, j);
        MySum ms2 = new MySum(i, j); // 30
        String s1 = "30";

        System.out.println(ms1);
        System.out.println(ms2.toString());
        
        if(ms1.equals(ms2))
            System.out.println("ms1과 ms2의 합계는 동일합니다.");
        
        if(ms1.equals(s1)) {
        	System.out.println("ms1과 s1의 합계는 동일합니다.");
        }else {
        	System.out.println("ms1과 s1의 값은 동일하지않습니다.");
        }

	}
	
	public static class MySum {
	    int first;
	    int second;
	    
	    MySum (int first, int second){
	        this.first = first;
	        this.second = second;
	    }

		
	    /* 조건1: Object의 toString은 주소를 문자로 return */
	    @Override
		public String toString() {
//			return first+second+"";
	    	return String.valueOf(first+second);
		}

	    /* 조건2: Object의 equals는 주소비교 */
	    @Override
		public boolean equals(Object obj) {
			if(!(obj instanceof MySum)) return false;
	    	MySum my = (MySum)obj;
			// return first+second==(my.first + my.second);
	    	return toString().equals(my.toString());
		}

	}

	    
	     
	    
	    

}
