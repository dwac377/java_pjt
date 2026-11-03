package com.office.member;

import java.util.Scanner;

public class MemberController implements MemberConfig {
	
	public void execute() {
		
		Scanner sc = new Scanner(System.in);
//		MemberService memberService =
//				new MemberService();
		
		MemberService.getMemberService();
		
		boolean systemFlag = true;
		
		while (systemFlag) {
			System.out.println("1.회원 가입 2. 로그인 3. 수정 4. 삭제 외 아무 키나 눌러 벗어나기");
			int selectedMenuNum = sc.nextInt();
			switch (selectedMenuNum) {
			
			case SIGN_UP:
				MemberService.getMemberService().signUp(sc);
				break;
				
			case SIGN_IN:
				MemberService.getMemberService().signIn(sc);
				break;
				
			case MODIFY:
				MemberService.getMemberService().modify(sc);
				
				break;
				
			case DELETE:
				MemberService.getMemberService().delete(sc);
				break;

			default:
				
				System.out.println("바바바이이이");
				systemFlag = false;
				
				break;
			}
			
		}
		
		
		sc.close();
		
	}

}
