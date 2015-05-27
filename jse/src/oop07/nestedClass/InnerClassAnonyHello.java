package oop07.nestedClass;
/*
Date : 2015. 5. 26
Author : 이재우
Desc : 
* */
public class InnerClassAnonyHello {
	interface GreetingService{
		public void greet(String name);//바디없는 추상메서드
	}
	public void sayHello(){
		/*
		 내부클래스 인터페이스 구현 방법 1.
		 */
		class EnglishGreetserviceImpl implements  GreetingService{

			@Override
			public void greet(String name) {
				System.out.println("Hello " + name);
				
			}
			
		}
		GreetingService eng = new EnglishGreetserviceImpl();
		
		/*
		 내부클래스 인터페이스 구현방법 2.
		 */
		
		GreetingService kor = new GreetingService() {
			
			@Override
			public void greet(String name) {
				System.out.println("안녕하세요."+name);
				
			}
		};
		eng.greet("TOM");
		kor.greet("톰");
	}
	public static void main(String[] args) {
		InnerClassAnonyHello greet = new InnerClassAnonyHello();
		greet.sayHello();
	}
}