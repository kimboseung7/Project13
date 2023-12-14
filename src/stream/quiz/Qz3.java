package stream.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Qz3 {

	public static void main(String[] args) {
		List<Order> orderList = new ArrayList<>();

		orderList.add(new Order(1001, 2022, 300));
		orderList.add(new Order(1002, 2022, 150));
		orderList.add(new Order(1003, 2022, 200));
		orderList.add(new Order(1004, 2023, 500));
		orderList.add(new Order(1005, 2023, 400));
		orderList.add(new Order(1006, 2023, 600));
		orderList.add(new Order(1007, 2023, 650));
		
		
		Stream<Order> stream1 = orderList.stream();
		stream1.
		map(i -> i.orderNo).forEach(n -> System.out.println(n));
		Stream<Order> stream2 = orderList.stream();
		
		int sum = stream2.filter(i -> i.year == 2022).mapToInt(p -> p.price).sum();
		System.out.print("총금액:" + sum);
		
		Stream<Order> stream3 = orderList.stream();
		long count = stream3.filter(i -> i.year == 2022).mapToInt(p -> p.orderNo).count();
		System.out.println(" 거래건수:" + count);
		
		Stream<Order> stream4 = orderList.stream();
		int sum1 = stream4.filter(i -> i.year == 2023).mapToInt(p -> p.price).sum();
		System.out.print("총금액:" + sum1);
		
		Stream<Order> stream5 = orderList.stream();
		long count1 = stream5.filter(i -> i.year == 2023).mapToInt(p -> p.orderNo).count();
		System.out.println(" 거래건수:"+ count1);
		
		
		
	}

}

//쇼핑몰 거래내역 클래스
class Order {

	int orderNo;
	int year;
	int price;

	public Order(int orderNo, int year, int price) {
		super();
		this.orderNo = orderNo;
		this.year = year;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", year=" + year + ", price=" + price + "]";
	}

}