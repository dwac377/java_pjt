import java.util.Scanner;

public class loopex2 {

	public static void main(String[] args) {
		
		while문 : while (조건문) {실행문}
		int i = 0;
		while (i < 5) {
			System.out.println("fu");
			i++;
		}
		
		int j = 0;
		boolean flag = true;
		
		while (flag) {
			System.out.println("던져");
			j++;
			if (j >= 5) {
				flag = false;
			}
			
		}
		
		do ~ while문 : 조건에 관계 없이 무조건 한번은 실행
		int e = 1;
		int sum = 0;
		
		do {
			sum += e;
			e++;
		} while (e <= 10); 
			System.out.println(sum);
		
		Scanner scanner = new Scanner(System.in);
		
		int condition = 0;
		
		do {
			System.out.println("우유 배송");
			System.out.println("정기 배송 진행 여부");
			
			System.out.println("1. 맛있다     2. 맛없다");
			condition = scanner.nextInt();
			
			if (condition == 2) {
				System.out.println("nonono");
			}
		} while (condition == 1); 
			
		
		
		scanner.close();
		
		
		
	}

}
