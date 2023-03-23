package com.shinhan.day11;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.shinhan.day05.Account;

public class StreamTest3 {

	public static void main(String[] args) throws IOException, URISyntaxException {
		f13();
	}

	private static void f13() {
		List<Student2> data = new ArrayList<>();
		data.add(new Student2("이택주", 95, "남"));
		data.add(new Student2("이길동", 80, "남"));
		data.add(new Student2("김아라", 100, "여"));
		data.add(new Student2("김길순", 60, "여"));
		data.add(new Student2("박길동", 70, "남"));
		
		Map<String,Double> map = data.stream().collect(
				Collectors.groupingBy(st->st.getGender(), 
				Collectors.averagingDouble(st->st.getScore()))
				);
		System.out.println(map);
		
	}

	private static void f12() {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		boolean result1 = Arrays.stream(arr).allMatch(su->su%2==0);
		System.out.println(result1);
		
		result1 = Arrays.stream(arr).anyMatch(su->su%2==0);
		System.out.println(result1);
				
		// 모든요소가 만족하지않는가?
		result1 = Arrays.stream(arr).noneMatch(su->su%2==0);
		System.out.println(result1);
		
		double d = Arrays.stream(arr).filter(su->su%2==0).average().orElse(0);
		System.out.println(d);
	}

	private static void f11() {
		List<Student> data = new ArrayList<>();
		data.add(new Student("김1", 100));
		data.add(new Student("박4", 90));
		data.add(new Student("이3", 70));
		data.add(new Student("정5", 60));
		data.add(new Student("김2", 80));
		
		data.stream().sorted().forEach(st->{System.out.println(st);});
		System.out.println("--------------------sort변경");
		data.stream().sorted((a,b)->a.getName().compareTo(b.getName())).forEach(st->{System.out.println(st);});
		
	}

	private static void f10() {
		int[] arr = {100,88,99,50,60};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}

	private static void f9() {
		List<String> data = new ArrayList<>();
		data.add("This is Java");
		data.add("i am a best developer");
		
		data.stream().flatMap(row->Arrays.stream(row.split(" "))).forEach(word->{System.out.println(word);});
		
	}

	private static void f8() {
		int[] arr = {10,20,70,90};
//		Arrays.stream(arr).asDoubleStream().forEach(d->{System.out.println(d);});
		
		Arrays.stream(arr).boxed().forEach(d->{System.out.println(d.floatValue());});
		
	}

	private static void f7() {
		List<Student> data = new ArrayList<>();
		data.add(new Student("김1", 100));
		data.add(new Student("박4", 90));
		data.add(new Student("이3", 70));
		data.add(new Student("정5", 60));
		data.add(new Student("김2", 80));
		// 점수가 70초과인 학생만 추출
		data.stream().filter(s->s.getScore()>70).forEach(s->{System.out.println(s);});
		
		// 이름이 김씨인 사람만 추출
		System.out.println("================이름이 김씨인 사람만 추출====================");
		data.stream().filter(st->st.getName().startsWith("김")).forEach(s->{System.out.println(s);});
		

		System.out.println("================이름이 김씨인 사람만 추출.. 점수.. 평균====================");
		data.stream().filter(st->st.getName().startsWith("김")).mapToInt(aa->aa.getScore()).average().ifPresent(d->{System.out.println("평균 : " + d);});
		
	}

	private static void f6() {
		List<String> data = new ArrayList<>();
		data.add("홍길동1");data.add("홍길동3");data.add("홍길동5");data.add("홍길동6");
		data.add("홍길동2");data.add("홍길동43");data.add("홍길동53");data.add("홍길동6");
		
		// distinct -> 중복제거
		// filter endsWith --> 3으로 끝나는것만 나오게 필터링
		data.stream().distinct().filter(s->s.endsWith("3")).forEach(s->{System.out.println(s);});
		
	}

	private static void f5() throws URISyntaxException, IOException {
		Path path = Paths.get(StreamTest3.class.getResource("data.txt").toURI());
		
		System.out.println(path);
		System.out.println(Charset.defaultCharset());
		Stream<String> streamData = Files.lines(path, Charset.defaultCharset());
		streamData.forEach(line->{System.out.println(line);});
	}

	private static void f4() throws IOException {
		FileReader fi = new FileReader("src/com/shinhan/day11/data.txt");
		int i; 
		while((i=fi.read())!=-1) {
			System.out.print((char)i);
		}
	}

	private static void f3() {
		// 1~9까지 range
		// 1~10까지 rangeClosed
		IntStream.rangeClosed(1, 10).forEach(su->{System.out.println(su + "*****");});
		
		
		
	}

	private static void f2() {
		List<Account> data = new LinkedList<>();
		data.add(new Account("123", "홍1", 1000));
		data.add(new Account("124", "홍2", 2000));
		data.add(new Account("122", "홍6", 3000));
		data.add(new Account("125", "홍5", 4000));
		data.add(new Account("126", "홍4", 5000));
		data.add(new Account("127", "홍3", 6000));
		
		// 모든계좌의 잔고의 합을 출력하기 ... 외부반복자를 이용
		int total=0;
		for(Account acc:data) {
			total+=acc.getBalance();
		}
		System.out.println("잔고의 합계" + total);
		
		// Stream을 이용하면 내부반복자를 사용한다.
		long total2 = data.stream().mapToLong(acc->acc.getBalance()).sum();
		System.out.println("Account balance 합계 :" + total2);
		
		total2=data.stream().map(acc->acc.getOwner()).count();
		System.out.println("건수는 : " + total2);
		
		// forEachOrdered : 순서를 보장한다
		// forEach : 순서를 보장안함
		
		data.stream().map(acc->acc.getOwner())
				.forEach(owner->System.out.println(owner + "예금주님"));
	}

	private static void f1() {
		// 여러건 저장하기 : 배열, Collection(List, Set, Map)
		List<Student> data = new ArrayList<>();
		data.add(new Student("김1", 100));
		data.add(new Student("김4", 90));
		data.add(new Student("김3", 70));
		data.add(new Student("김5", 60));
		data.add(new Student("김2", 80));
		// data를 stream으로 만들어서 중간처리, 최종처리
		data.stream().forEach((st) -> {
			System.out.println(st);
			System.out.println(st.getName() + "-->" + st.getScore());
		});
		System.out.println("------------중간처리 test------------");
		data.stream().mapToInt(st -> st.getScore()).forEach(score -> {
			System.out.println(score);
			System.out.println("----------------------");
		});

		System.out.println("------------최종처리 test------------");
		double d = data.stream().mapToInt(st -> st.getScore()).average().getAsDouble();
		System.out.println("average=" + d);

		System.out.println("------------Optional test1------------");
		OptionalDouble option = data.stream().mapToInt(st -> st.getScore()).average();
		option.ifPresent(result -> System.out.println(result));

		System.out.println("------------Optional test2------------");
		data.stream().mapToInt(st -> st.getScore()).average().ifPresent(result -> System.out.println(result));
		
		System.out.println("------------Optional test3------------");
		data.stream().mapToInt(st -> st.getScore())
		.average()
		.ifPresentOrElse(d1->{System.out.print(d);},
				()->{System.out.println("평균계산실패");});

	}

}
