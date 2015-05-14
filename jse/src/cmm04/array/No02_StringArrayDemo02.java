package cmm04.array;

public class No02_StringArrayDemo02 {
	public static void main(String[] args) {
		String[] juso = {"서울", "종로", "광화문"};
		
		for(int i = 0; i<juso.length ; i++){
			System.out.println("주소 : "+ juso[i]);
		}
		// 배열 명 +length : 배열의 끝이 나오면 조건문 종료
	}

}
