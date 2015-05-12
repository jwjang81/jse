package cmm01.var;  // Ű���� ����(�ĺ���) �����ݷ�
/*
  Data : 2015.05.11
  Author : �����
  Description : ĳ���� ���� ���� �н��ڷ�
 * */ 
class No02_CastingDemo{
	public static void main(String[] args) {
/*
Up-Casting 
��ȯ (Conversion) 
 = promotion
 =������(Implict) �ڵ���ȯ
 �ڵ���  ��ȯ�� ������ Ÿ���� ǥ�������� ���� �ʿ���
 ���� ������ ��ȯ�� �� ���� �����ϴ�.
 byte -> short -> int -> long -> float -> double
 char -> int
 * */
		
		byte varByte = 1;
		int varInt = 123;
		double varDouble = 123.456;
		
		int upByte = varByte;
		double upByte2 = varByte;
		double upInt = varInt;
		

		
		System.out.println("HellowJava");
		
		/*
		Down - Casting
		ĳ����(Casting)
		������ȯ
		���α׷����� �����(explict) ���� �����ϴ� Ÿ�Ժ�ȯ
		��Һ�ȯ�� �Ǵ� ��쿡�� �ݵ�� ��������� ĳ�����Ͽ��� �Ѵ�.
		��, ������ �ս��� �߻��� �� �ִ�.
			 * */
			
			Double varDou = 123.456;
			int varInt2 = 3;
//			int downByte = (int) varDou;
			byte varB2 = (byte) varInt2;
			float varF = 123.456f;
			int varInt3 = (int) varF;
		
			System.out.println("varInt3 �� : "+ varInt3);	
	}
	
	
} // Ű���� ����(�ĺ���) �ٵ�(�߰�ȣ)

