package innerclass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//라이브러리를 불러올려면 import사용 

//awt: 화면 기반 어플리케이션을 개발하기 위한 라이브러리

//익명 클래스 예제
public class Ex6 {

	public static void main(String[] args) {
		// 1. 화면 만들기
		Frame frame = new Frame();
		
		frame.setLayout(new FlowLayout());
		
		frame.setBounds(500, 300, 500, 300);
		
		frame.setVisible(true);
		
		// 2. 버튼 만들기
		Button button = new Button("Click");
		
		frame.add(button);
		
		// 3. 버튼 이벤트 등록하기
		button.addActionListener(new EvenHandler());
		button.addActionListener(new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("버튼을 클릭했습니다....");
			}
			
			
		});
	}

}


class EvenHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("버튼을 클릭했습니다!");
	}
	
}