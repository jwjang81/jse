package api01.lang.thread;
/*
 * Date : 2015. 6. 02
 * Author : 이재우
 * Desc
 * */
public class BankSyncDemo2 {
	public static void main(String[] args) {
		// 사용자 정의 타입의 배열을 생성하는 방법은 아래와 같다.
		Customer2[] customers = new Customer2[3];
		Account2 hong = new Account2("홍길동");
		Account2 kim = new Account2("김길동");
		Account2 moon = new Account2("문길동");
		
		customers[0] = new Customer2(hong, "강남점", 100);
		customers[0].start();
		customers[1] = new Customer2(kim, "종로점", 200);
		customers[1].start();
		customers[2] = new Customer2(moon, "마포점", 300);
		customers[2].start();
		customers[0] = new Customer2(hong, "가산점", 700);
		customers[0].start();
		
		
		
	}
}
class Account2{
	String name;
	int total;
	/*
	 * 코딩 습관 : 생성자를 생성시킬 때는
	 * 무조건 필드를 선언 후 바로 CTRL + SPACE ENTER
	 * */
	/*
	 * 생성자 오버로딩을 하려고 할 때는
	 * 자동생성 시킨 생성자에다 this("") 이런 식으로
	 * String 이면 "", int 면 0 , 객체면 null 을 주면 된다. 
	 * */
	public Account2() {}
	public Account2(String name) {
		this.name = name;
	}
	/*
	 * 파라미터값 int money : 입출금
	 * 파라미터값 String location : 지점
	 * */
	public void deposit(int money, String location){
		total += money;
		try{
			Thread.sleep(1000);
			System.out.println(name+ "고객님" 
			+ "["+location+"]" + money +" 원 입금함 / "
					+ "총액 : " + total +" 원");
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
class Customer2 extends Thread{
	Account2 account; // 사용자정의 객체를 필드의 인스턴스 변수로 선언함.
	int money;
	/*public Customer() {
		this(null,"",0);
	}*/
	public Customer2(Account2 account2, String str, int money) {
		super(str); // super 를 사용하려면 가장 먼저 호출해야 함.
		// this.account = account; 해도 에러는 나지 않지만 가독성...
		this.account = account2;
		this.money = money;
	}
	@Override
	public void run() {
		// this.getName() 은 스레드가 이미 구현한 메소드를 
		// 가져다 쓰겠다는 뜻.
		account.deposit(money, this.getName());
	}
}