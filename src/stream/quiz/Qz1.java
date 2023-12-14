package stream.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Qz1 {

	public static void main(String[] args) {
		String[] arr = {"aaa","aaa","b", "b", "ccccc"};
		
		Stream<String> stream1 = Arrays.stream(arr);
		int sum = (int) stream1.filter(s -> s.length() > 2).count();
		System.out.println(sum);
		
		Stream<String> stream2 = Arrays.stream(arr);
		int sum2 = stream2.mapToInt(s -> s.length()).sum();
		System.out.println(sum2);
		
		Stream<String> stream3 = Arrays.stream(arr);
		stream3.map(s -> s.length()).sorted().limit(1).forEach(n -> System.out.println(n));
			
		Stream<String> stream4 = Arrays.stream(arr);
		List<String> bb = stream4.distinct().collect(Collectors.toList());;
		System.out.println(bb);
		
		Stream<String> stream5 = Arrays.stream(arr);
		OptionalInt optinalInt = stream5
				.mapToInt(s -> s.length())
				.min();
				System.out.println(optinalInt.getAsInt());
		
	}

}
