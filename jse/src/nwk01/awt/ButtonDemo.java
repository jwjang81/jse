package nwk01.awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Toolkit;

public class ButtonDemo {
	public static void main(String[] args) {
		/*
		 * [1] 컴포넌트를 만든다. 조립할 객체를 생성한다.
		 */
		Frame frame = new Frame("메모장");
		frame.setSize(500, 300); // (너비, 높이)
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dim = toolkit.getScreenSize();

		

		Button btnOK = new Button("확 인");
		btnOK.setSize(100,50);  // (너비, 높이)
		btnOK.setBackground(Color.yellow);
		btnOK.setLocation(100,75);  // (x 좌표, y 좌표)
		/*
		 * [2] 만들어진 컴포넌트를 조립한다.
		 */
		frame.setLayout(null);
		frame.add(btnOK);
	

		/*
		 * [3] 컴포넌트를 화면에 띄우기
		 */
		frame.setLocation(dim.width / 2 - 270, dim.height / 2 - 150);
		frame.setVisible(true);
		
		/*
		 한글깨짐 솔루션(해결책)
		 프로젝트명 우클릭
		 -> 맨 밑 properties 클릭
		 -> run/debug setting 클릭
		 -> 현재 클래스명 더블클릭
		 -> arguments 탭 클릭
		 -> VM arguments 빈공간에
		 -> -Dfile.encoding=MS949 입력
		 -> 저장 후 재실행
		 * */
	}
}
