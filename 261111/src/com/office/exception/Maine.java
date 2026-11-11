package com.office.exception;
public class Maine {
	
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 0;
		
		System.out.println(n1 + n2);
		
//		try ~ catch 문 = 예외 처리
		try {
			System.out.println(n1 / n2);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
//		catch는 연속적으로 사용할 수 있다, if ~ else if와 비슷하게 사용 가능
		} catch (Exception e) {
			// TODO: handle exception
//			예외가 발생해도 무조건 실행 시키고 싶은 코드 있을 때 사용, 없어도 됨.
		} finally {
			System.out.println("나는 최종적이다");
		}
		
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
	}
}
