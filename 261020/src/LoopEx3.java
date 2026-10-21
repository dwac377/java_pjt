
public class LoopEx3 {

	public static void main(String[] args) {
		
//		break, continue
//		break : 프로그램 실행 중 만나면 즉시 중단
//		continue : 반복 실행 중 만나면 다음 반복문으로 넘아감
		
//		1 ~ 10까지 정수의 합을 구하되 합이 30을 초과하면 중단
//		int sum = 0;
//		for (int i = 0; i <= 10; i++) {
//			sum += i;
//			if (sum > 30)
//				break;
//		}
//		System.out.println(sum);
//		
//		1부터 10까지의 정수를 출력하되, 짝수만 출력하기
//		for (int i = 1; i <= 10; i++) {
//			if (i % 2 != 0)
//				continue;
//			System.out.println(i);
//		}

//		반복문 이름 부여하기
//		구구단을 출력하기 , 구구단을 출력할 때 짝수 곱셈 생략
//		모든 구구단 곱셈 결과 값을 덧셈하되 합이 200을 초과하면 출력 중단
		
		int sum = 0;
		loopLabe2:
		for (int i = 2; i < 10; i++) {
			loopLabe1:
			for (int j = 1; j < 10; j++) {
				if (j % 2 == 0)
					continue loopLabe1;
				sum += i * j;
				if (sum > 200)
					break loopLabe2;
				System.out.printf("%d * %d = %d \n", i, j, sum);
			}
		}		
		
	}

}
