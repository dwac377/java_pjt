import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		
//		안녕하세요 5회 응애 출력 응애, 밖에서 정의한 변수도 쓸수 있긴 함 ㅇㅇ;;
		for (int i = 0; i < 5; i++) {
			System.out.println("응애1");
		}
		int n = 10;
//		밖에서 정의한 변수 쓰기
		for (; n < 20; n++) {
			System.out.println("응애2");
		}
//		밖에서 정의한 변수 가져다 값 새로 넣어서 쓰기
		for (n = 1; n < 20; n++) {
			System.out.println("응애3");
		}

//		1부터 사용자가 입력한 정수까지의 합을 구하기
		Scanner scanner = new Scanner(System.in);
		int data = scanner.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= data; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("3 * %d = %d %n", i, (3 * i));
		}
		
		for (int i = 1; i == 9; i++) {
			for (int n = 2; n == 9; n++) {
				System.out.printf("%d * %d = %d", n, i, (n * i));
			}
		}
		
		scanner.close();
		
	}

}
