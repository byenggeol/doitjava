package chapter02;

public class IntegerEx {

	public static void main(String[] args) {
		byte bNum = 100;
		short sNum = 10_000; //��ǻ�ʹ� �����(_)�� NO�ν�.
		short sNum1 = 10000;
		int iNum = 1_000_000_000;
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(sNum1);
		System.out.println(iNum);
//		bNum = 200; //byte�ڷ����� -128���� 127���� ��밡��. �̰����Ұ�
		/*
		�ּ�ó�� ����Ű 
		crtl + shift + c
		��Ʈ�� + /
		��Ʈ�� + 7
		*/
		
//		sNum = 40_000; // -32768 ~ 32767���� ��밡��.
		
//		iNum = 2_000_000_000 // ��Ʈ�� 21���������밡��
//		iNum = Integer.MAX_VALUE;
		System.out.println(1_000_000_000); //10�����
		System.out.println(3_000_000_000L); 
		//long �ڷ�� ������ L�� ���̴µ� �빮�ڸ� ����ؾ��Ѵ�
		int result;
		result = sNum + bNum;
		
		long lNum = 3_000_000_000L;
		System.out.println(lNum);
	}

}
