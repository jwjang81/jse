package nwk02.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * UI : User Interface 는 화면을 구성하는 개념으로
 * 사용자가 처음 마주하는 부분이라는 의미이다.
 * */

// extends JFrame implements ActionListener : 상속과 구현을 동시에 함
// 필드에 공유할 인스턴스 변수를 먼저 선언한다.
public class LottoUI  extends JFrame implements ActionListener{
	LottoVO lotto; // Lotto 변수에 있는 값을 아래 메소드들이 공유하기 위해
				   // 필드에 인스턴스 변수를 선언하였다.
	JButton btn;
	JPanel panelNorth, panelSouth;
	ImageIcon icon; // import 단축키 : CTRL + SHIFT + O
	List<JButton> btns; // List 는 java.util.List 를 선택한다.
	
	// 생성자 생성 : CTRL + SPACE
	public LottoUI() {
		init();  /* 생성자 보안 , create method init 클릭*/
	}
	
	private void init() { // init() 은 initialize 라는 초기화의 의미를 갖고있다.
		setTitle("로또생성기");  // public class LottoUI  extends JFrame 에 상속되어있기때문에 오류가 발생하지 않음
		lotto = new LottoVO(); // 필드에 인스턴스변수가 선언되어서 객체생성이 가능하다.
		btns = new ArrayList<JButton>();
		panelNorth = new JPanel();
		panelSouth = new JPanel();
		btn = new JButton("생성기");
		/* 버튼에 인터페이스가 가지고 있는 기능을 할당한다. */
		btn.addActionListener(this); // 프레임 하부조직인 버튼에 ActionListener 기능 부여
		panelNorth.add(btn);
		add(panelNorth, BorderLayout.NORTH);
		add(panelSouth, BorderLayout.SOUTH);
		setBounds(300, 400, 1200, 300);
		// 300, 400 은 x,y 좌표
		// 1200, 300 은 필셀을 단위로 하는 사이즈
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트를 처리하는 능력을 ActionListener 인터페이스로부터 
		// 부여받았다.
		if(btns.size()==0){
			makeBtns();  // create method 'makeBtns' 클릭
		}
		lotto.setLotto();
		showLotto();
		
	}

	private void showLotto() {
		int[] arr = lotto.getLotto(); // getter 쓴 것
		System.out.println("배열크기 확인 : "+ arr.length);
		for(int i = 0 ; i < arr.length ; i++){
			btns.get(i).setIcon(getIcon(arr[i]));
		}
		
	}

	private Icon getIcon(int i) {
		String imgPath = "src/images/"+Integer.toString(i)+".gif";
		return new ImageIcon(imgPath);
	}

	private void makeBtns() {
		// JButton tmp = new JButton() 과 
		// 아래 로직이 다른점은
		// 인스턴스 창조변수(객체) 를 1개 생성하는 것과
		// 6개를 생성하는 차이점이다.
		JButton tmp = null;
		for(int i = 0 ; i < 6 ; i++){
			tmp = new JButton();
			btns.add(tmp);  // 숫자가 붙지 않은 버튼 형식으로만 만들어진 리스트에 
			// 인덱스를 할당하는 것.
			panelSouth.add(tmp);  // 아래쪽 패널에 버튼을 조립하는 것.
		}
		
	}

}
