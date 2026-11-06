package com.office.MemberS;

import java.util.Scanner;

import com.office.DB.MemberDao;
import com.office.DB.MemberDto;
import com.office.diary.diaryMenu;
import com.office.member.Imember;

public class MemberService implements Imember {
	
	MemberDao memberDao = new MemberDao();
	diaryMenu diaryMenu = new diaryMenu();

	@Override
	public void logUp(MemberDto memberDto) {
		
		boolean isMemberId = memberDao.isMemberIdTaken(memberDto.getMemId());
		
		if (isMemberId) {
			
			if (memberDto.getMemPw().length() <= 4) {
				System.out.println("비밀번호는 5자리 이상이여야 합니다");
				
			} else {
				
				memberDao.insertMember(memberDto);
				System.out.println("회원 가입 성공");
			}
			
		} else {
			
			System.out.println("아이디 중복");
		}
		
	}

	@Override
	public void logIn(MemberDto memberDto, Scanner sc) {
		
		MemberDto searchedMemberDto = memberDao.searchMemberByMemIdAndMemPw(memberDto);
		
		if (searchedMemberDto != null) {
			System.out.println("로그인 성공");
			diaryMenu.diaryMeuns(sc);
		} else {
			System.out.println("로그인 실패");
		}
		
	}
	
	@Override
	public void modyfi(MemberDto memberDto) {
		
		MemberDto searchedMemberDto = memberDao.searchMemberByMemIdAndMemPw(memberDto);
		
		if (searchedMemberDto != null) {
			memberDao.modifyMember(memberDto);
		}
		
	}
	

}
