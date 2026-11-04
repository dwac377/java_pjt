package com.office.member;

import java.util.Scanner;

public class MemberController implements MemberConfig {
	
	public void execute() {
		
		Scanner sc = new Scanner(System.in);
//		MemberService memberService =
//				new MemberService();
		
		MemberService memberService = new MemberService();
		
		boolean systemFlag = true;
		
		while (systemFlag) {
			System.out.println("1.회원 가입 2. 로그인 3. 수정 4. 삭제 외 아무 키나 눌러 벗어나기");
			int selectedMenuNum = sc.nextInt();
			
			switch (selectedMenuNum) {
			
			case SIGN_UP:
				System.out.println("새로운 아이디 입력하라!");
				String memId = sc.next();
				System.out.println("새로운 비밀 번호 입력하라!");
				String memPw = sc.next();
				System.out.println("이메일 입력하라!");
				String memEmail = sc.next();
				System.out.println("전화 번호 입력하라!");
				String memPoneNum = sc.next();
				
				MemberDto memberDto = new MemberDto(memId, memPw, memEmail, memPoneNum);
				
				memberService.signUp(memberDto);
				break;
				
			case SIGN_IN:
				
				
				
				break;
				
			case MODIFY:
				
				
				
				break;
				
			case DELETE:
				
				
				
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
