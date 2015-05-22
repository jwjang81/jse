package oop01.syntax;

public class AverageC {
	/*필드 선언*/
	String name;
	int kor;
	int eng;
	int tot;
	double avg; // 합계
	
	/*이름 저장하는 기능*/
	public void steName(String foo){
		this.name = foo; // 매개변수 파라미터 값
	}
	
	/*국어 점수를 저장하는 기능*/
	public void setkor(int kor){
		this.kor = kor;
	}
	
	/*영어 점수를 저장하는 기능*/
	public void seteng(int eng){
		this.eng = eng;
	}
	/*합계를 구하는 기능*/
	public void settot(int kor, int eng){
		this.tot = kor + eng; //배치는 여기서 따로 할 수 있다.
	}
	
	/*평균점수를 구하는 기능*/
	public void setavg(int tot){
		this.avg = tot/2;
	}
	/*평균점수를 구하는 기능 2.. 국어 영어 점수 두개만으로 구하기*/
	/*Overloading " 오버로딩*/
	
	public void setavg(int kor, int eng){
		this.avg = (kor + eng)/2;
	}

}
