package oop07.nestedClass;
/*
Date : 2015. 5. 26
Author : 이재우
Desc : 
* */
/*
내부클래스의 세번째 형태.
- Local 내부 클레스에서는 외부 클래스의 멤버를 접근하는데 있어서
- 제한이 따른다. 우선 외부 클래스의 멤버변수는 접근을 할 수 있다.
- 하지만 메서드 내에 있는 지역변수는 접근 할 수 없다.
*/
public class InnerClassLocal {
	int a = 100;
	public void innerTest(int k){
		int b = 200;
		final int c = k;
		class Inner{//일회용 클래스
			public void getData(){
				System.out.println("멤버변수  a : " + a);
				System.out.println("상수 c : " + c);
				//System.out.println("지역변수 b : " + b); 지역변수에대해선 참조할수 없음
			}
		}
		Inner inn = new Inner();
		inn.getData();
		
		new Inner(){}.getData();
	}
}