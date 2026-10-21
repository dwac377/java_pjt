import java.util.Scanner;

public class printClass {

	public static void main(String[] args) {

//		형식 문자열 출력 : 데이터를 출력할 때 특정 형식에 맞춰 출력해야 하는 경우에 사용한다
		String name1 = "Mr. hong";
//		이름 : Mr. hong  의 형식으로 출력하고 싶다면?
		System.out.printf("이름: %s", name1);
		
//		"이름: %s" <-- 형식
//		%s <-- 지정자
		
//		이름: 홍길동, 주소: 대전
		String name2 = "홍길동";
		String add1 = "대전";
		System.out.printf("이름: %s, 주소: %s", name2, add1);
		
//		지정자 종류
//		%d : 정수형
//		%f : 실수형
//		%c : 문자형
//		%s : 문자형
//		%b : 논리형
//		%o : 8진수 출력
//		%x : 16진수 출력
//		%n : 개행
//		형식 문자열은 값이 순서대로 들어간다
		System.out.printf("이름:%s 나이: %d, %n", "홍길동", 30);
		System.out.printf("결혼 여부: %b, %n", false);
		System.out.printf("10진수 123 -> 8진수 %o, %n", 123);
		
//		사용자한테 이름과 나이, 몸무게와 신장을 입력 받아 출력하는 코드를 작성하시오
//		
		Scanner scanner = new Scanner(System.in);
		System.out.println("input name");
		String name = scanner.nextLine();
		System.out.println("input age");
		int age = scanner.nextInt();
		System.out.println("input weight");
		float weight = scanner.nextFloat();
		System.out.println("input height");
		double height = scanner.nextDouble();
		
		System.out.printf("name: %s age %d weight %f height %f", name, age, weight, height);
		
		scanner.close();
		
	}

}
