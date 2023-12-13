package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * 스트림의 특징
 * */
public class Ex2 {

	public static void main(String[] args) {

		// 1.한번 생성하고 사용한 스트림은 재사용할 수 없다
		List<Integer> list = Arrays.asList(5, 1, 2, 4, 3, 3); // 리스트 생성
		Stream<Integer> stream = list.stream(); // 스트림 생성
		stream.forEach(n -> System.out.print(n)); // 리스트 안에 값을 하나씩 출력
//		int count = stream.count(); //에러남. 이미 스트림이 소모되어 닫혔음

		// 2.스트림 연산은 원본데이터를 변경하지 않는다
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(list); // 원본 데이터 그대로 있음
		System.out.println(sortedList);
		
		Stream<Integer> stream3 = list.stream();
		
		stream3.filter(n -> n>=3) //중간연산
		.sorted() //중간연산
		.forEach(n -> System.out.println(n + " ")); //최종연산
	}
}