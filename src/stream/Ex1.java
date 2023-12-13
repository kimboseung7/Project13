package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex1 {

	public static void main(String[] args) {
		// 리스트 생성
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		/*
		 * 이 메서드는 주어진 인수를 가지고 배열을 생성한 후, 해당 배열을 List로 변환합니다. 여기서는 1, 2, 3, 4, 5 다섯 개의
		 * 정수로 이루어진 배열을 생성하고 이를 List로 변환합니다.
		 */
		// 리스트로부터 스트림 생성하기
		Stream<Integer> stream1 = list.stream(); // 원본의 자료형과 똑같음 //메모리 영역이 다르기 때문에 원본데이터에 지장x

		// 객체 배열로부터 스트림 생성하기
		String[] strArr = { "a", "b", "c" }; // 원본데이터
		Stream<String> stream2 = Stream.of(strArr);
		Stream<String> stream3 = Stream.of(strArr); // 제네릭이므로 원본데이터 타입을 그대로 써줌, 데이터 소스를 인자로

		 // 기초 배열로부터 스트림 생성하기
        int[] intArr = { 1, 2, 3, 4, 5 }; // 정수형 배열 선언 및 초기화

        // Arrays.stream 메서드를 사용하여 intArr 배열로부터 IntStream 생성
        IntStream stream4 = Arrays.stream(intArr); 
        // Stream<Integer>가 아니라 IntStream이 반환됨(기본형 스트림)
        // 언박싱을 하여 연산을 수행하므로 속도가 빠름
	}

}
