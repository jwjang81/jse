package api02.util.hashMap;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = Scanner.next();
		System.out.println("나이를 입력하세요");
		int age = Scanner.nextInt();   // 숫자 입력은 nextInt() 주의!!
		System.out.println("ID를 입력하세요");
		String id = Scanner.next();
		System.out.println("비번을 입력하세요");
		String password = Scanner.next();
		System.out.println("주소를 입력하세요");
		String addr = Scanner.next();
		/*
		 * 기능으로 특화된 MemberServiceImpl의 객체를 생성한다.
		 * 왜냐면, 입력받은 값들을 DB에 저장하고,
		 * 맵에 담아서 사용하기 위해서이다.
		 * */
		MemberService service = new MemberServiceImpl();
		// 객체를 생성하는 이유는 그 객체가 가지고 있는 기능(메소드)을
		// 호출하기 위해서이다.
		
		service.join(id, password, name, age, addr);
		System.out.println("회원가입이 되었습니다.");
		System.out.println("로그인을 해주세요");
		System.out.println("ID를 입력해 주세요 :");
		id = Scanner.next();
		System.out.println("비번을 입력해 주세요 :");
		password = Scanner.next();
		
		service.Login(id, password);
		
	}
}
