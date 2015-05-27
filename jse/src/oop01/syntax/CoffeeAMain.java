package oop01.syntax;

class coffeeA{
	public coffeeA(){
		System.out.println("돈을 넣다.");
	}
	public coffeeA(int money){
		System.out.println(money + "원");
	}
	public coffeeA(int money, boolean exist){
		System.out.println("구매가능여부 :" + (exist == true ? "커피종류선택" : "커피없음"));
	}
}
public class CoffeeAMain {
	public static void main(String[] args) {
		coffeeA coffeeA = new coffeeA();
		coffeeA coffeeAA = new coffeeA(500);
		coffeeA coffeeAAA = new coffeeA(500, true);
	}

}
