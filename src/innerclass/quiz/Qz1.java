package innerclass.quiz;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Qz1 {

	public static void main(String[] args) {
		
		Frame frame = new Frame();
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300);
		
		TextArea textArea = new TextArea("텍스트상자",10,50);
		frame.add(textArea);
		
		frame.setVisible(true);
		
		textArea.addFocusListener(null);
		
//		// 미리 구현한 클래스로 키 이벤트 등록
//		MyFocusListener listener =new MyFocusListener();
//				textArea.addFocusListener(listener);
		
		textArea.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				
				System.out.println("텍스트에 포커스가 벗어났습니다!");
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("텍스트에 포커스 되었습니다");
				
			}
		});
	}

}
class MyFocusListener implements FocusListener{

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		System.out.println("텍스트에 포커스 되었습니다");
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		System.out.println("텍스트에 포커스가 벗어났습니다!");
	}
	
	
	
}