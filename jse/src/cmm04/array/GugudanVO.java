package cmm04.array;

public class GugudanVO {
	public void calc(){
		for (int i = 1; i < 10; i++) {
			System.out.println();
			for (int dan = 2; dan < 6; dan++) {
				System.out.print(dan + "*" + i + "=" + dan * i + "\t");
			}
		}
		System.out.println();
		for (int i = 1; i < 10; i++) {
			System.out.println();
			for (int dan = 6; dan < 10; dan++) {
				System.out.print(dan + "*" + i + "=" + dan * i + "\t");
			}
		}
	}
	
}
