
public class MainClass {

	public static void main(String[] args) {
//		변수란 메모리의 특정 공간을 의미한다, 이곳에 데이터(값)가 들어간다!
//		변수 선언 & 변수 초기화
//		변수 선언 : 메모리의 특정 공간을 청소하고, 변수명을 달아주는 작업
//		변수 초기화 : 변수에 특정 데이터를 저장하는 작업
//		변수 선언 + 변수 초기화 = 변수 정의
		
//		java에서 정수를 이용한 변수 선언 & 초기화하는 법
//		데이터 타입(정수, 실수, 문자열 등) 변수명 = 데이터;
//		int num = 10; // 변수 선언 및 초기화 한번에!
//		int num2; // 변수 선언과 초기화를 따로!
//		num2 = 20;
//		
//		System.out.println("num:" + num);
//		System.out.println("num2:" + num2);
//		
//		int address = System.identityHashCode(num);
//		System.out.println(address); // 메모리 주소 찾기. 783286238
		
//		변수명 작명 가이드
//		1. 변수명은 일반적으로 소문자로 시작하는 것을 권장한다.
//		2. 변수명은 일반적으로 영문을 사용하는 것을 권장한다. 
//		3. 변수명은 데이터의 의미를 직관적으로 파악할 수 있도록 작명하는 것을 권장한다.
//		int score = 50;
//		String player = "gil";
//		String map = "map";
//		4. 두개 이상의 단어가 조합된 경우 낙타 표기법을 권장한다 (C 계열은 스네이크 표기법을 주로 사용)
//		int myScore = 50;
//		int totalScore = 50;
//		String newItem = "bock";
//		5. 키워드는 변수명으로 사용 불가하다.
//		public, class, void, for, it, switch, case 등등
//		6. _ 언더바를 제외한 특수 문자, 공백은 변수명으로 사용할 수 없으며 숫자는 첫 글자를 제외하여 사용해야 한다.
		
////		데이터 변경
//		int number = 10;
//		System.out.println(number);
//		number = 20;
//		System.out.println(number);
////		주의 사항 : 동일한 이름으로 변수 선언 X 예시: int number = 30;
////		데이터 복사
//		int num1 = 15;
//		System.out.println(num1);
//		int num22 = num1;
//		System.out.println(num22);
		int n1 = 10;
		int n2 = 20;
		
		System.out.print(n1);
//		
////		가로 세로 변수를 각각 만들고 방의 넓이 구하기
//		int horizontal;
//		int vertical;
//		
//		horizontal = 100;
//		vertical = 50;
//		System.out.println("방의 넓이:" + (horizontal * vertical));
	}

}
