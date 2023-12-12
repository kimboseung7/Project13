package innerclass;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*
 * 익명클래스 사용하기
 * */
public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 화면 만들기
		Frame frame = new Frame();

		frame.setLayout(new FlowLayout());

		frame.setBounds(500, 300, 500, 300);

		frame.setVisible(true);

		// 3. 버튼 이벤트 등록하기
		frame.addKeyListener(new MykeyListener ());
		
		
		//익명클래스로 키 이벤트 등록
		frame.addKeyListener( new KeyAdapter() {

			public void keyPressed(KeyEvent e) {
				System.out.println("키를 눌렀습니다!");
			}
		});
	}

}
//클래스 상속 extends
//implement 인터페이스 상속

class MykeyListener extends KeyAdapter{

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("키를 눌렀습니다!");
	}
	
}
