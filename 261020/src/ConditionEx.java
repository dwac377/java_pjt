import java.util.Scanner;

class ConditionEx {

	public static void main(String[] args) {
		
//		if 문
//		문법 구조 : if (조건식) {실행문} 
		Scanner scanner = new Scanner(System.in);

		int userInputData = scanner.nextInt();
		if (userInputData > 10) {
			System.out.println("10보다 크긴 해 ㅇㅇ;;");
		}
		 f (userInputData < 10) {
			System.out.println("10보다 작긴 해 ㅇㅇ;;");
		}
		if (userInputData == 10) {
			System.out.println("같긴 해;;");
		}
		
//		if ~ else 문
		byte myScore = scanner.nextByte();
		if (myScore >= 80) {
			System.out.println("통과");
		} else {
			System.out.println("아니불");
		}
		
//		if ~ else if 문 : 다중 비교
		int score = scanner.nextInt();
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}
		
//		중첩 조건문
//		사용자가 입력한 정수가 10보다 크다면 짝수인지 홀수인지 판별하기3
		int num = scanner.nextInt();
		
		if (num > 10) {
			System.out.println("10보다 크다");
			if (num % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		} else {
			System.out.println("10보다 같거나 작다");
		}
		
		switch ~ case문 : switch (조건식) \n { case 조건식 결과 값 \n 실행문 \n break; }
		
		final int SAVING_MODE = 1;
		final int SHIT_DOWN = 2;
		final int RE_START = 3;
		
		System.out.println("1. 절전 2, 종료 3, 재시작");
		int str = scanner.nextInt();
		
		switch (str) {
		case SAVING_MODE:
			System.out.println("절전모드");
			break;
		case SHIT_DOWN:
			System.out.println("종료");
			break;
		case RE_START:
			System.out.println("재시작");
			break;
		}
		
		final int NORMAL = 1;
		final int VIP = 2;
		final int VVIP = 3;		
		
		System.out.println("1,노마루 2,v 3,vv");
		int customerGrade = scanner.nextInt();
		
		switch (customerGrade) {
		case NORMAL:
			System.out.println("월 문자 50번 무료");
			break;
		case VIP:
			System.out.println("월 문자 50번 무료");
			System.out.println("월 1회 영화 10%할인 쿠폰");
			break;
		case VVIP:
			System.out.println("월 문자 50번 무료");
			System.out.println("월 1회 영화 10%할인 쿠폰");
			System.out.println("항공사 5% 할인 쿠폰");
			break;
		}
		
		switch (customerGrade) {
		case VVIP:
			System.out.println("항공사 5% 할인 쿠폰");
			
		case VIP:
			System.out.println("월 1회 영화 10%할인 쿠폰");
			
		case NORMAL:
			System.out.println("월 문자 50번 무료");
			break;
		default:
			System.out.println("마 정신 똑디 차리라");
			break;
		
		}
		
		scanner.close();	
	}

}
