package lambda;

public class Ex1 {

	public static void main(String[] args) {
		// 람다식으로 함수 구현
		Calc calc = (x,y) -> x+y; //(x,y) 메게변수 --> 코드(반환)
		
		//인터페이스 변수로 메소드 호출
		System.out.println(calc.add(3, 5));
	}

}


@FunctionalInterface 
//Annotation이 메소드가 추가되는걸 방지해줌
interface Calc{
	int add(int num1, int num2); 
	//인터페이스는 하나의 메소드만 가지고 있어야됨(추가 방지) --> 2개 에러
	
//	int max(); //컴파일 에러 발생 (추가 x)
} 
