package cmm04.array;
// 안좋은 예
public class No05_Gugudan03 {
	public static void main(String[] args) {
		for(int dan = 2 ; dan <= 9 ; dan+=4){
			for(int i = 1 ; i <= 9 ; i++){
				System.out.print(dan + "*" + i +"=" + (dan)*i +"\t");
				System.out.print((dan+1) + "*" + i +"=" + (dan+1)*i + "\t");
				System.out.print((dan+2) + "*" + i +"=" + (dan+2)*i + "\t");
				System.out.print((dan+3) + "*" + i +"=" + (dan+3)*i + "\t");
				System.out.println("\t");
			}
			System.out.println();
			
		}
	}

}
