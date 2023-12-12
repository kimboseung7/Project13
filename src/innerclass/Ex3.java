package innerclass;

public class Ex3 {

	public static void main(String[] args) {
		// 인스턴스 내부 클래스의 인스턴스 생성
		
		Outer outer = new Outer();
		
		Outer.InstanseInner instanseInner = outer.new InstanseInner (); //outer를 먼저 만듬
		instanseInner.i1 = 300; //인스턴스 변수 사용
		instanseInner.i2 = 300;	// 정적변수 사용
		
		Outer.InstanseInner instanseInner2 = outer.new InstanseInner ();
		instanseInner2.i1 = 400; //인스턴스 변수 사용
		instanseInner2.i2 = 400;	// 정적변수 사용
		
		System.out.println("첫번째 인스턴스 내부 클래스: "+instanseInner.i1 + "," + instanseInner.i2);
		System.out.println("두번째 인스턴스 내부 클래스: "+instanseInner2.i1+ "," + instanseInner2.i2);
		
		//정적 내부 클래스의 인스턴스 생성
		//아우터 클래스를 먼저 명시하고 내부클래스 꺼내줌
		Outer.StaticInner staticInner = new Outer.StaticInner(); //바로 사용가능 위와 다르게
		staticInner.i1 =300;
		staticInner.i2 =300;
	}

}
class Outer{
	//인스턴스 클래스는 인스턴스벼수와 정적변수를 모두 가질 수 있다
	class InstanseInner{
		int i1 = 100;
		//단, 외부 객체없이는 사용할 수 없기 때문에 정적변수는 
		static int i2 =200;
	}
	//정적 클래스는 인스턴스변수와 정적변수를 모두 가질 수 있음
	static class StaticInner{
		int i1 = 100;
		static int i2 = 200;
	}
}