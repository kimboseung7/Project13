package stream.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Qz2 {

	public static void main(String[] args) {

		//파일 목록 생성
		String[] arr
		= {"file.txt","file2.pdf","file3.txt","file4.img","file5.txt","file6.img"};
		
		Stream<String> stream1 = Arrays.stream(arr);
		stream1.filter(s -> s.contains("txt")).forEach(n -> System.out.println(n));
		
		Stream<String> stream2 =Arrays.stream(arr);
		long txtSum = stream2.filter(s -> s.contains("txt")).count();
		System.out.println("txt파일의 개수 : " +txtSum);
		
		Stream<String> stream3 =Arrays.stream(arr);
		long pdfSum = stream3.filter(s -> s.contains("pdf")).count();
		System.out.println("pdf파일의 개수 : " + pdfSum);
		
		Stream<String> stream4 =Arrays.stream(arr);
		long imgSum = stream4.filter(s -> s.contains("img")).count();
		System.out.println("img파일의 개수 : " + imgSum);
		
		//3.파일의 확장자만 추출하여 출력하세요
		// 결과: txt pdf img
		Stream<String> stream5 =Arrays.stream(arr);
		stream5.map(s -> {
			//.을 구분자로 사용하여 문자열을 자름.(점은 특수문자)
			String[] strArr = s.split("\\."); //strArr이라는 배열에 저장
			return strArr[1];
			}).distinct().forEach(n -> System.out.println(n));
		
		
	}

}
