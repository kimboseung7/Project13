package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex5 {

	public static void main(String[] args) {
		List<Customer> customerList = new ArrayList<>();

		Customer customer1 = new Customer("둘리", 40, 100);
		Customer customer2 = new Customer("또치", 13, 50);
		Customer customer3 = new Customer("도우너", 25, 70);

		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);

		System.out.println(customerList);

		// 고객의 명단
		Stream<Customer> stream1 = customerList.stream();

		stream1.map(c -> c.name) // key를 통해 value를 얻음
				.forEach(s -> System.out.println(s));

		// 모든 고객의 총 예산
		Stream<Customer> stream2 = customerList.stream();

		int sum = stream2.mapToInt(c -> c.budget).sum(); // 스트림클래스를 기본형으로 변환
		System.out.println(sum);
		
		//20세 이상 고객 명단
		Stream<Customer> stream3 = customerList.stream();
		stream3
			.filter(c -> c.age>=20) //20살 이상만 걸리짐
			.map(c -> c.name) // value값을 얻음
			.sorted() //정렬
			.forEach(s -> System.out.println(s));
		
	}

}

class Customer {
	String name;// 이름
	int age; // 나이
	int budget; // 여행경비

	public Customer(String name, int age, int budget) {
		super();
		this.name = name;
		this.age = age;
		this.budget = budget;

	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", budget=" + budget + "]";
	}

}
