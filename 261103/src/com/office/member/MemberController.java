package com.office.member;

import java.util.Scanner;

public class MemberController implements MemberConfig {
	
	final private MemberService memberService;
	
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	

	
	public void execute() {
		
//		MemberService memberService = new MemberService();
		
		
		

		
		Scanner sc = new Scanner(System.in);
		
		String memId;
		String memPw;
		String memEmail;
		String memPoneNum;
		MemberDto memberDto;
		
		if (IS_DEV)
			new Dumy().sigUpForDumy(memberService);
		
		
		boolean systemFlag = true;
		
		while (systemFlag) {
			System.out.println("1.회원 가입 2. 로그인 3. 수정 4. 삭제 외에 아무 키나 눌러 벗어나기");
			int selectedMenuNum = sc.nextInt();
			
			switch (selectedMenuNum) {
			
			case SIGN_UP:
				System.out.println("새로운 아이디 입력하라!");
				memId = sc.next();
				System.out.println("새로운 비밀 번호 입력하라!");
				memPw = sc.next();
				System.out.println("이메일 입력하라!");
				memEmail = sc.next();
				System.out.println("전화 번호 입력하라!");
				memPoneNum = sc.next();
				
				memberDto = new MemberDto(memId, memPw, memEmail, memPoneNum);
				
				memberService.signUp(memberDto);
				break;
				
			case SIGN_IN:
				System.out.println("아이디 입력하라!");
				memId = sc.next();
				System.out.println("비밀 번호 입력하라!");
				memPw = sc.next();
				
				memberDto = new MemberDto(memId, memPw, null, null);
				
				memberService.signIn(memberDto);
				
				break;
				
			case MODIFY:
				
				System.out.println("아이디 입력하라!");
				memId = sc.next();
				System.out.println("비밀 번호 입력하라!");
				memPw = sc.next();

				
				memberDto = new MemberDto(memId, memPw, null, null);
				
				boolean isAuthentication = memberService.doAuthenticationByMemIdAndMempw(memberDto);
				
				if (isAuthentication) 
					System.out.println("바꿀 이메일 입력하라!");
					memEmail = sc.next();
					System.out.println("바꿀 비밀 번호 입력하라!");
					memPw = sc.next();
					System.out.println("바꿀 전화 번호 입력하라!");
					memPoneNum = sc.next();
					
					memberDto.setMemPw(memPw);
					memberDto.setMemEmail(memEmail);
					memberDto.setMemPoneNum(memPoneNum);
					
					memberService.modify(memberDto);
				
				
				
				
				break;
				
			case DELETE:
				System.out.println("아이디 입력하라!");
				memId = sc.next();
				System.out.println("비밀 번호 입력하라!");
				memPw = sc.next();
				
				memberDto = new MemberDto(memId, memPw, null, null);
				
				memberService.delete(memberDto);
				
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
