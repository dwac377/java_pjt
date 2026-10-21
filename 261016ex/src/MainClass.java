import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
//		데이터 타입
//		메모리에 저장할 데이터의 종류에 따라 할당 받는 메모리 크기가 다르게 된다
//		각각의 메모리 크그에 따라 데이터 종류 구분하는 것을 말한다.
		
//		메모리 단위
//		1비트 (최소 단위) 1 바이트 (비트 8개)
//		• KB (킬로바이트, Kilobyte)  = 1,024 B (또는 1,000 B)
//		• MB (메가바이트, Megabyte)  = 1,024 KB
//		• GB (기가바이트, Gigabyte)  = 1,024 MB
//		• TB (테라바이트, Terabyte)  = 1,024 GB
//		• PB (페타바이트, Petabyte)  = 1,024 TB
//		• EB (엑사바이트, Exabyte)   = 1,024 PB
//		• ZB (제타바이트, Zettabyte) = 1,024 EB
//		• YB (요타바이트, Yottabyte) = 1,024 ZB		

//		정수 데이터 타입
//		byte  : 1byte = -128 ~ 127
//		short : 2byte = -32,768 ~ 32,767
//		int   : 4byte = -2,147,483,648 ~ 2,147,483,647 
//		long  : 8byte = -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 ) 922경

		
		byte byteNum = 127;
		System.out.println(byteNum);
		short short1 = 30000;
		System.out.println(short1);
		int int1 = 32132131;
		System.out.println(int1);
		long long1 = 7223372036854775808L;
		System.out.println(long1);
		
//		오버 플로우 예시
		byte num = -128;
		System.out.println(num);
		num = (byte)(num - 1);
		System.out.println(num);

		int num = -2147483648;
		System.out.println(num);
		num = (num - 1);
		System.out.println(num);

//		데이터 타입 최소, 최대 값 알아내기
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
//		...
		
//		실수 (부동소수점)
//		float  : 4바이트 f 붙여야 됨
//		double : 8바이트 f X	
		float num = 3.14f;
		System.out.println(num);
		double num2 = 3.14159265358979;
		System.out.println(num2);
//		실수 최소, 최대 값 구하기
		System.out.println(Float.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		float num1 = 3.14159265358979323846264338327950288f;
	    double num2 = 3.14159265358979323846264338327950288d;
	    System.out.println(num1);
	    System.out.println(num2);
		
//		논리 데이터 타입 : 참(true)/거짓(false)
//		boolean : 1byte
//		boolean flag = true;
//		System.out.println(flag);
		
//		문자와 문자열 데이터 타입
//		문자 : 메모리에 문자 데이터를 저장하기 위해서 사용하는 데이터 타입
//		char : 2byte
//		char ch = '응';
//		System.out.println(ch);
//		ch = 'ㄴ';
//		System.out.println(ch);
//		빈 문자(empty) vs 공백 문자(space)
//		char ch1 = '';  empty X 문자가 반드시 한개가 있어야 한다
//		char ch2 = ' '; space O 공백도 문자다
		
//		문자는 메모리에 저장될 때 정수(유니코드)로 저장이 된다
//		char ch1 = 'ɛ';
//		System.out.println(ch1);
//		문자 유니코드 출력
//		int unicode = ch1;
//		System.out.println(unicode);
//		char num = 65; // 유노코드로 직접 기재
//		System.out.println(num); // 문자 A 출력
		
//		문자열
//		String str = "호잇";
//		System.out.println(str);
//		String str = "";
//		String str = " "; 문자열은 빈, 공백 다 됨. 
		
//		콘솔을 이용한 데이터 입출력
//		데이터 출력
		System.out.print("ddwdw");  가장 먼저 나온 출력, 개행하지 않는다
		System.out.println("dwdwdwd"); line의 약자 ln을 뒤에 붙여 개행
		System.out.print("ddw23dw\n"); \n 역 슬래쉬 n으로 개행
		System.out.println(변수); 문자열 뿐만 아니라 변수를 넣어서 변수에 저장된 값을 출력할 수도 있다
		
//		특수 정리 : \n(개행) \t(4칸 공백) \'(작은 따옴표) \"(큰 따옴표) \\ (역 슬래쉬)
		
//		', ", \ 등은 기능이 있기 때문에 \를 붙여 문자열로 출력시킨다
		System.out.println("\\\\\\26sus\\\\\\");
		System.out.println("mr. s\t2020_100123");
		System.out.println("mr. h\t2020_000123");
		System.out.println("이름\t학번\n");
		System.out.println("어머님께서는 \" 만수무강하셨다 \"아버지는 아쉽게도...");
		
//		데이터 입력
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println(str);
		
//		nextbyet()   	: 정수 -128 ~ 127 , 1 바이트
//		nextint()	 	: 정수 -2,147,483,648 ~ 2,147,483,647 , 4바이트
//		nextLong()	 	: 정수 -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 , 8바이트
//		nextFloat()  	: 실수 , 4바이트
//		nextDouble() 	: 실수 , 8바이트
//		nextLine()   	: 문자열
//		nextBoolean()	: 논리 , 참/거짓

		int inputint = scanner.nextInt();
		System.out.println(inputint);
//		
		scanner.nextLine();
//		
		String inString = scanner.nextLine();
		System.out.println(inString);
		
//		nextLine은 직전 스캐너에 입력한 엔터(개행)까지 읽어 버리기 때문에 이 가비지 데이터를 읽고 버릴 스캐너가 필요하다.
//		둘다 nextLine으로 하면 해당 줄에 입력된 모든 것을 읽기 때문에 스캐너가 추가로 필요하지 않다.
		
		String input2 = scanner.next();
		System.out.println(input2);
//		
		scanner.close();  close()를 호출하지 않으면 스트림이 계속 열려 있어 시스템 리소스 낭비가 발생할 수 있다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
