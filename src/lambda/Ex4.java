package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex4 {

	public static void main(String[] args) {
		// 문자열 리스트 생성
		List<String> list = new ArrayList<>();

		// 문자열 추가
		list.add("add"); // 데이터 타입에 맞는 문자열 추가(String)
		list.add("ccc");
		list.add("bbb");

		// 리스트를 순서대로 정렬하기

		// 리스트를 순서대로 정렬하기

		// Collections.sort(): 리스트의 데이터를 순서대로 정렬하는 기능
		// 인자: 문자열 리스트, 리스트 정렬하는 로직을 가지고 있는 Comparator 클래스
//		Collections.sort(list,new Comparator<String>(){ //구현 클래스를 만든다음 안에 구현체를 넣음 -> 인스턴스를 인자로 전달
//
//			@Override
//			public int compare(String o1, String o2) { //compare 리스트를 정렬하는 로직을 가지고 있음
//				return o1.compareTo(o2);
//			}}); 
		System.out.println("리스트 순정렬:" + list);
		
		
		Collections.sort(list, (s1, s2) -> s1.compareTo(s2)); //두 문자열을 비교해 숫자값을 순차적으로 정렬 
		System.out.println("리스트 순정렬:" + list);

	}

}
