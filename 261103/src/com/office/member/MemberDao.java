package com.office.member;

import java.util.HashMap;

public class MemberDao {
	
	HashMap<String, MemberDto> db = new HashMap<String, MemberDto>();

	
//	아이디 중복 확인, 불리언 값 반환을 통해
	public boolean isMember(String memId) {
		
//		MemberDto memberDto = db.get(memId);
		
		return db.get(memId) != null ? true : false;
	}
	
//	사용자 정보를 db에 주입 정보가 널이 아니라면 1, 널 이라면 0을 반환
	public int insertNewMember(MemberDto memberDto) {
//		매개 변수로 받아온 memberDto의 아이디 값을 키로 memberDto를 참조하는 리스트 형성
		db.put(memberDto.getMemId(), memberDto);
//		호출부
		return db.get(memberDto.getMemId()) != null ? 1 : 0;
	}
	
//	사용자가 입력한 ID, PW와 DB의 데이터를 비교
	public MemberDto searchMemberByMemIdAndMemPw(MemberDto memberDto) {
//		사용자가 입력한 memberDto의 아이디를 키 값으로 db에서 동일한 키를 가진 memberDto객체 참조
		MemberDto dto = db.get(memberDto.getMemId());
//		사용자가 입력한 아이디 값이 존재한다면 dto에 참조 값이 복사 - 널이 아님, 그렇게 가져온 참조한 객체에서 비밀번호로 들어가 db와 dto의 비밀번호 비교
		if (dto != null && dto.getMemPw().equals(memberDto.getMemPw())) {
//			호출부 변수에 dto 참조 반환.
			return dto;
			
			} else {
			return null;
			}
		
		}
	
	
//	인증 후 정보 삭제
	public MemberDto deleteMemberByMemIdAndMemPw(MemberDto memberDto) {
		
		MemberDto dto = db.get(memberDto.getMemId());
		
		if (dto != null && dto.getMemPw().equals(memberDto.getMemPw())) {
			MemberDto deletedMemberDto = db.remove(memberDto.getMemId());
			
			if (deletedMemberDto != null) {
				return deletedMemberDto;
				} else {
				return null;
			}
			
		} else {
		return null;
		}
	}
	

	public MemberDto updateMemberByMemId(MemberDto memberDto) {
		
		db.put(memberDto.getMemId(), memberDto);
		
		return db.get(memberDto.getMemId());
	}

}
