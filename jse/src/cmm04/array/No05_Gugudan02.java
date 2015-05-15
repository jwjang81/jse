package cmm04.array;

public class No05_Gugudan02 {
	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			System.out.println("\t");
			for (int dan = 2; dan < 6; dan++) {
				System.out.print(dan + "*" + i + "=" + dan * i + "\t");
			}
		}
		System.out.println();
		for (int i = 1; i < 10; i++) {
			System.out.println("\t");
			for (int dan = 6; dan < 10; dan++) {
				System.out.print(dan + "*" + i + "=" + dan * i + "\t");
			}
		}

	}

}
