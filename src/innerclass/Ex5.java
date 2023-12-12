package innerclass;

class Outer {

		private int a = 10;
		private static int b = 20;
		
		class Inclass{
			int i1 = a; //외부클래스의 private 멤버도 
			int i2 = b;
		}
		static class InStaticClass{
			int i2 =b;
		}
	}


//private 로 되있는 변수(외부클래스)도 내부클래스에서 사용할 수 있음