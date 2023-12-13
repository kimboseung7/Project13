package lambda.quiz;

public class Qz2 {

	public static void main(String[] args) {
//		

		Hello hello1 = new Hello() {

			@Override
			public void helloPrint() {
				System.out.println("안녕하세요");
			}
		};
		hello1.helloPrint();

		// 람다식 함수 사용
		Hello hello2 = () -> System.out.println("안녕하세요"); // interface에 인자가 비어 있으므로 람다식 인자가 비어있음
		hello2.helloPrint();

		// 구현 클래스
		Hello hello3 = new HelloImp();
		hello3.helloPrint();
	}
}

//함수형 인터페이스 선언
interface Hello {
	void helloPrint(); // 추상메소드 선언
}

// 구현 클래스 사용을 위해 함수형 인터페이스 상속자 클래스를 만들어줌
class HelloImp implements Hello {

	@Override
	public void helloPrint() {
		System.out.println("안녕하세요");
	}

}