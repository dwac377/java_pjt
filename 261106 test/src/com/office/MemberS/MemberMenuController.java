package com.office.MemberS;

import java.util.Scanner;

import com.office.DB.MemberDto;
import com.office.config.Config;

public class MemberMenuController implements Config {
	
	public void execute() {
		
		boolean sysF = true;
		Scanner sc = new Scanner(System.in);
		
		String memId;
		String memPw;
		String memEmail;
		MemberDto memberDto;
		
		MemberService memberService = new MemberService();
		
		while (sysF) {
			
			System.out.println("1. 회원가입   2. 로그인   3.정보 수정   99.ecece");
			int selectMenu = sc.nextInt();
			
			switch (selectMenu) {
	
			case LOG_UP:
				System.out.println("사용하실 아이디를 입력하십시오");
				memId = sc.next();
				System.out.println("사용하실 비밀 번호를 입력하십시오");
				memPw = sc.next();
				System.out.println("사용하실 이메일을 입력하십시오");
				memEmail = sc.next();
				
				memberDto = new MemberDto(memId, memPw, memEmail);
				
				memberService.logUp(memberDto);
				
				break;
			case LOG_IN:
				System.out.println("아이디를 입력하십시오");
				memId = sc.next();
				System.out.println("비밀 번호를 입력하십시오");
				memPw = sc.next();
				
				memberDto = new MemberDto(memId, memPw, null);
				
				memberService.logIn(memberDto, sc);
				
				break;
				
			case MODYFI:
				System.out.println("아이디를 입력하십시오");
				memId = sc.next();
				System.out.println("비밀 번호를 입력하십시오");
				memPw = sc.next();
				
				memberDto = new MemberDto(memId, memPw, null);
				
				memberService.modyfi(memberDto);
				
				

			case 99:
				System.out.println("qqq222");
				sysF = false;
				break;
			}
			
		}
		sc.close();
		
	}
	
	

}
