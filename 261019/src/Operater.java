
public class Operater {

	public static void main(String[] args) {
		
	     /*
	       *  산술 연산자   +, -, *, /, %, ++, --
	         할당 연산자   =, +=, -=, *=, /=, %=, &=, |=
	         비교 연산자   ==, !=, >, <, >=, <=
	         논리 연산자   &&, ||, !
	       */
		
//		1.숫자 덧셈
		int num1 = 10;
		int num2 = 20;
		float num3 = 3.1423f;
		float num4 = 2.14302f;
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num3 + num4 = " + (num1 + num4));
//		2.문자열 덧셈 (얘는 뺼셈 안 됨)
		String str1 = "hello ";
		String str2 = "world";
		System.out.println(str1 + str2);
//		3.연결 연산자
		System.out.println(10 + " 안녕");
		System.out.println(10.3291 + " 안녕"); //숫자가 문자열화 되어 출력
//		4.문자 사칙연산 & 나머지 연산
		System.out.println('A' + 'B');
		System.out.println('A' - 'B');
		System.out.println('A' * 'B');
		System.out.println('a' % 'A');
		System.out.println('a' / (float)'A');
//		5.숫자 뺄셈
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num3 - num4 = " + (num3 - num4));
//		6.곱셈
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num3 * num4 = " + (num3 * num4));
//		7.나눗셈
		System.out.println("num1 / num2 = " + ((float)num1 / num2));
		System.out.println("num3 / num4 = " + (num3 / num4));
//		8.나머지 연산
		System.out.println("num1 % num2 = " + (num1 % num2));
		System.out.println("num3 % num4 = " + (num3 % num4));
	}

}
