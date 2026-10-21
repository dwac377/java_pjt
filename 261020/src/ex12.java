
public class ex12 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {
			System.out.println();
			for (int n = 2; n < 10; n++) {
				System.out.printf("%d * %d = %d\t", n, i, (n * i));
			}
		}
		
		for (double d = 0.0; d < 1; d +=0.1) {
			System.out.printf("d: %f \n", d);
		}
		
		for (int i = 1; i <= 6; i++) {
			for(int n = 0; n < i; n++) {
				System.out.print("*");
			}
			System.out.println();
		} 
		
		for (int i = 1; i <= 5; i++) {
			for(int n = 0; n <= 5 - i; n++) {
				System.out.print("*");
			}
			System.out.println();
		} 
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		달력 만들기
		System.out.println(" 월\t 화\t 수\t 목\t 금\t 토\t 일");
		int offset = 3;
		int day = 1;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < offset; j++) {
				System.out.print(String.format("%3c\t",'-'));
			}
			for (int j = 0; j < 7 - offset; j++) {
				if (day <= 30) {
				System.out.print(String.format("%3d\t", day));
				day++;
			} else {
				System.out.print(String.format("%3c\t", '-'));
			}
				}
			offset = 0;
			System.out.println();
		}
		
		
		*** 중첩 for문을 이용할 때 절대 3단계 이상 사용하지 말자 **
		}
}
