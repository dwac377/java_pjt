
public class opr2 {

	public static void main(String[] args) {
		
//		1. 대입 연산자
//		int no = 10; // = (대입, 할당 연산자)
//		2. 복합 대입 연산자
//		+=, -=,*=, /=, %= : 각각 덧셈, 뺼셈, 곱셈, 나눗셈, 나머지 연산 후 할당
		
		/*
	       *  +=   no += 10;   no에 10을 더한 결괏값을 no에 대입한다.
	         -=   no -= 10;   no에 10을 뺀 결괏값을 no에 대입한다.
	         *=   no *= 10;   no에 10을 곱한 결괏값을 no에 대입한다.
	         /=   no /= 10;   no를 10으로 나눈 결괏값을 no에 대입한다.
	         %=   no %= 10;   no를 10으로 나눈 나머지를 no에 대입한다.
	       */
		
//		3. 증감 연산자 : ++, --
//		no ++;
//		System.out.println(no);
//		no --;
//		System.out.println(no);
		
//		4. 전위 & 후위 연산자 :
		int num2 = 10;
		int result1 = ++num2;
		System.out.println(result1);
		System.out.println(num2);
		
		int num3 = 10;
		int result2 = num3++;
		System.out.println(result2);
		System.out.println(num3);
		
		int num4 = 10;
		int result3 = 0;
		result3 = (num4++);
		System.out.println(result3);
		System.out.println(num4);
		

	}

}
