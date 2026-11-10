package com.office.member;

import java.util.Scanner;

import com.office.config.Config;
import com.office.menu.Menu;
import com.office.session.Session;

public class MemberController {
	
	private final MemberService memberService;
	
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}

	public void execute(Scanner sc, int selectedMenu) {
		
		String memId;
		String memPw;
		String memEmail;
		String memPhone;
		
		switch (selectedMenu) {
		
		case Menu.MEMBER_SIGN_UP:
			System.out.println("새로운 아이디를 입력하십시오");
			memId = sc.next();
			System.out.println("새로운 비밀 번호를 입력하십시오");
			memPw = sc.next();
			System.out.println("새로운 이메일을 입력하십시오");
			memEmail = sc.next();
			System.out.println("새로운 전화번호를 입력하십시오");
			memPhone = sc.next();
			
			int resultForSignUp = memberService.singUp(
					new MemberDto(memId, memPw, memEmail, memPhone));
			
			if (resultForSignUp == MemberService.SIGN_UP_SUCCES) {
				System.out.println("회원 가입 성공");
			} else {
				System.out.println("회원 가입 실패");
			}
			break;
			
		case Menu.MEMBER_SIGN_IN:
			System.out.println("아이디를 입력하십시오");
			memId = sc.next();
			System.out.println("비밀 번호를 입력하십시오");
			memPw = sc.next();
			
			MemberDto signInedMemberDto = 
					memberService.singIn
					(new MemberDto(memId, memPw, null, null));
			
			if (signInedMemberDto != null) {
				System.out.println("로그인 성공");
				Session.getInstance().setAttribute
						(Config.SIGNINED_MEMBER_ID, signInedMemberDto.getMemId());
			} else {
				System.out.println("로그인 실패");
			}
			
			break;
			
		case Menu.MEMBER_SIGN_OUT:
			
			Session.getInstance().removeAttribute(Config.SIGNINED_MEMBER_ID);
			
			break;
			
		case Menu.MEMBER_MODIFY:
			
			MemberDto signeInMemberDto = memberService.getMember();
			
			System.out.println("아이디" + signeInMemberDto.getMemId());
			System.out.println("비밀 번호" + signeInMemberDto.getMemPw());
			System.out.println("이메일" + signeInMemberDto.getMemEmail());
			System.out.println("전화 번호" + signeInMemberDto.getMemPhone());
			
			System.out.println("새로운 비밀 번호를 입력하십시오");
			memPw = sc.next();
			System.out.println("새로운 이메일을 입력하십시오");
			memEmail = sc.next();
			System.out.println("새로운 전화번호를 입력하십시오");
			memPhone = sc.next();
			
			int resultForModify = memberService.modify(
				    new MemberDto(
				        String.valueOf(
				            Session.getInstance()
				                .getAttribute(Config.SIGNINED_MEMBER_ID)
				        ),
				        memPw,
				        memEmail,
				        memPhone
				    )
				);
			
		if (resultForModify == MemberService.MODIFY_SUCCES) {
			System.out.println("변경 완료");
		} else {
			System.out.println("변경 실패");
		}
			
			break;
		case Menu.MEMBER_DELETE:
			
			int resultFordelete = memberService.delete(
					String.valueOf(Session.getInstance().getAttribute(Config.SIGNINED_MEMBER_ID)));
			
			if (resultFordelete == MemberService.DELETE_SUCCES) {
				System.out.println("삭제 성공");
				Session.getInstance().removeAttribute(Config.SIGNINED_MEMBER_ID);
			} else {
				System.out.println("삭제 실패");
			}
			
			break;

		default:
			break;
		}
	}
}
