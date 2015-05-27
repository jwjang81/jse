package oop01.syntax;

public class CardVO {
	private String kind; // 카드의 무늬
	private int number;  // 카드의 숫자
	static int width = 150; // 카드의 너비
	static int height = 300; // 카드의 높이
	public CardVO(String kind, int number){
		System.out.println("카드는 " + kind + "이고 숫자는" + number + "입니다.");
		this.kind = kind;
		this.number = number;
	}
	
	public String getkind(){
		return kind;
	}
	
	public void setkind(String kind){
		this.kind = kind;
	}
	
	public int getNumber(){
		return number;
	}
	
	public void setNumber(int number){
		this.number = number;
	}

}
