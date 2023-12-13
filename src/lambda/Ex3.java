package lambda;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 구현 클래스 사용하기
		StringConcat concat1 = new StringConcatImp1();
		concat1.makeString("Hello", "World");

		// 람다식 함수 사용하기
		StringConcat concat2 = (str1, str2) -> System.out.println(str1 + "," + str2);
		concat2.makeString("Hello", "World"); 
		
		// 첫 번째는 함수를 호출하기 위해 구현클래스를 만들고 인스턴스를 생성하고 만듬
		// 두 번째 람다식은 클래스를 만들지 않고 함수만 정의해서 사용가능

	}

}

//메소드 추가 방지
@FunctionalInterface
interface StringConcat {
	// 두 문자열을 연결하는 메소드 선언
	// 추상메소드로 선언
	public void makeString(String s1, String s2);

}

class StringConcatImp1 implements StringConcat { // 위에 있는 인터페이스를 상속받음

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + "," + s2);
		// print로 두문자열을 합침 //한줄인 경우 중괄호 생략가능

	}

}