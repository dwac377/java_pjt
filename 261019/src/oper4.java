
public class oper4 {

	public static void main(String[] args) {
		
//		논리 연산자
//		&& (and) : 두 조건이 참일 경우 참,
//		|| (or)  : 둘 중 하나라도 참이면 참,
//		! (not)  : 결과를 반대로 바꿈 A가 참이면 거짓, 거짓이면 참
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		boolean result = (num1 < num2) && (num2 < num3);
		System.out.println(result);
		result = (num1 < num2) || (num2 < num3);
		System.out.println(result);
		
		System.out.println(!true); // 한번 부정해서 거짓이다
		System.out.println(!!true); // 두번 부정해서 참이다
		
//		&&, || 연산자 우선 순위, 둘다 논리 연산자라서 우선 순위가 동등해 순차적으로 기능할 것이라 생각되지만
//		실제 연산 순위는 &&가 더 높다
		boolean result2 = false;
		result2 = (num1 < num3) || (num2 < num3) && (num1 > num3);
		System.out.println(result2);
//		&&부터 연산 후 ||을 연산한다, 따라서 결과 값은 참이다
		result2 = ((num1 < num3) || (num2 < num3)) && (num1 > num3);
		System.out.println(result2);
//		이러한 코드를 쓸 경우 명시적으로 연산 우선 순위를 지정해주는 것이 좋다
		
//		조건식||삼항식 연산자
		int passScore = 80;
		int myScore = 90;
		String resultStr = (myScore >= passScore) ? "pass" : "fail";
		System.out.println(resultStr);
		
		
	}

}
