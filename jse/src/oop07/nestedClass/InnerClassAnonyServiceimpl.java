package oop07.nestedClass;
/*
Date : 2015. 5. 26
Author : 이재우
Desc : 오버로딩, 오버라이딩
* */
public class InnerClassAnonyServiceimpl {
	String data = "Hello Anonymous World !!";
	public void print(){
		new InnerClassAnonyService(){

			@Override
			public void printData() {
				System.out.println("익명 내부 클래스 출력 : " + data);
				
			}
			
		}.printData();
	}
	
}