package lambda;

/*
 * 람다식의 동작원리
 * 
 * */
public class Ex2 {

	public static void main(String[] args) {

		// 메소드를 람다식으로 구현
		// Calc calc = (x,y) -> x+y;

		// 컴파일러는 람다식을 익명클래스로 변환하고, 클래스의 인스터스를 생성한다 (일회성 코드)
		Calc calc = new Calc() { // 부모타입 참조변수 = 부모의 이름 블록
			@Override
			public int add(int x, int y) {
				return x + y;
			}
		};
		// 함수 사용
		System.out.println(calc.add(3, 5)); //3과 5를 add메소드로 인자를 호출
	}

}

@FunctionalInterface
interface Calc {
	int add(int num1, int num2);
}