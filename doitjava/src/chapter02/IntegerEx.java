package chapter02;

public class IntegerEx {

	public static void main(String[] args) {
		byte bNum = 100;
		short sNum = 10_000; //컴퓨터는 언더바(_)를 NO인식.
		short sNum1 = 10000;
		int iNum = 1_000_000_000;
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(sNum1);
		System.out.println(iNum);
//		bNum = 200; //byte자료형은 -128부터 127까지 사용가능. 이것은불가
		/*
		주석처리 단축키 
		crtl + shift + c
		컨트롤 + /
		컨트롤 + 7
		*/
		
//		sNum = 40_000; // -32768 ~ 32767까지 사용가능.
		
//		iNum = 2_000_000_000 // 인트는 21억까지만사용가능
//		iNum = Integer.MAX_VALUE;
		System.out.println(1_000_000_000); //10억출력
		System.out.println(3_000_000_000L); 
		//long 자료는 영문자 L을 붙이는데 대문자를 사용해야한다
		int result;
		result = sNum + bNum;
		
		long lNum = 3_000_000_000L;
		System.out.println(lNum);
	}

}
