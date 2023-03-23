package example.practice;

public class ProductTest {
	public static void main(String[] args) {
		ProductVO[] productList = { 
				new ProductVO("마이쭈", 25000, "Samsong"),
				new ProductVO("꿈틀이", 32000, "Samsong"),
				new ProductVO("짱구", 17050, "Samsong"),
				new ProductVO("새우깡", 24500, "Samsong"),
				new ProductVO("고소미", 75000, "Daehoo") };
		
		productList = selectProduct(productList, 25000);
		for (int i = 0; i < productList.length; i++) {
			System.out.println(productList[i].toString());
		}
	}

	// Object상속받아서 ProductVO를 만들었다.
	// 자동형변환 : 부모타입의 참조변수 = 자식객체
	private static ProductVO[] selectProduct(Object[] productList, int i) {
		
		// 구현하시오.
		ProductVO[] plist = new ProductVO[productList.length];
		int index = 0;
		for(Object obj:productList) {
			// 강제형변환 : 자식타입의 참조변수 = (자식타입)부모객체
			// 전제조건 : 부모객체가 자동형변환된 경우만 가능 
			// ProductVO product = (ProductVO)obj;
			if(!(obj instanceof ProductVO product))  continue;
			if(product.getPrice()>=i)	{
				plist[index] = product;
				index++;
			}
			
		}

		return plist;
	}
}

//매개변수로 들어온 객체의 배열로부터 가격이 특정 금액 이상인 상품만 추출하여 
//새로운 배열에 담아서 리턴하는 메서드를 구현하시오. 

//<<실행결과 >>
//
//ProductVO [name=마이쭈, price=25000, maker=Samsong]
//ProductVO [name=꿈틀이, price=32000, maker=Samsong]
//ProductVO [name=고소미, price=75000, maker=Daehoo]