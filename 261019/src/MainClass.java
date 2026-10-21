
public class MainClass {

	public static void main(String[] args) {
		
//		지정자에 사용할 수 있는 옵션들
//		1. [.precision] : 소수점 아래 자릿수를 지정한다.
		float rate = 3.141592f;
		System.out.printf("rate: %f %n", rate);
		System.out.printf("rate: %.2f %n", rate);
		System.out.printf("rate: %.4f %n", rate);
		System.out.printf("rate: %.5f %n", rate);
//		2. [width] : 전체 출력 자릿수를 지정하고 오른쪽 정렬
		int num1 = 1;
		int num2 = 12;
		int num3 = 123;
		System.out.printf("num1 :%3d %n", num1);
		System.out.printf("num2 :%3d %n", num2);
		System.out.printf("num3 :%3d %n", num3);
//		왼쪽 정렬은 - 붙이면 된다
		System.out.printf("num1 :%-3d %n", num1);
		System.out.printf("num2 :%-3d %n", num2);
		System.out.printf("num3 :%-3d %n", num3);
//		3. [flags] : 전체 출력 자릿수가 지정된 경우 빈칸을 0으로 채운다. 오른쪽 정렬만 가능 왼쪽 정렬은 왜 안 될까? 생각해봐라 미래의 나
		int num11 = 1;
		int num22 = 12;
		int num33 = 123;
//		위드에 0만 추가하면 된다
		System.out.printf("num1 :%04d %n", num11);
		System.out.printf("num2 :%04d %n", num22);
		System.out.printf("num3 :%04d %n", num33);
//		4. [argument_index$] : 데이터 적용 위치 지정
		int num111 = 1;
		int num222 = 2;
		int num333 = 3;
		int num444 = -1;
		System.out.printf("num: %d num : %d num : %d num %d %n", num111, num222, num333, num444);
		System.out.printf("num: %4$d num : %1$d num : %3$d num %2$d %n", num444, num111, num333, num222);
		
//		형식 문자열 반환하기 : String.format() === JS에서 ``(백팁, 템플릿 문자열)
		String res = String.format("나의 이름은%s이며 나이는 %d살이다%n", "hoha", 20);
		System.out.println(res);
//		JS에선?
//		let name = hkhk;
//		let age = 10;
//		console.log(`이름은 ${name} 나이는 ${age}이다`);
	}

}
