package com.office.member;

import java.util.HashMap;

public class MemberDao {
	
	HashMap<String, MemberDto> db = new HashMap<String, MemberDto>();

	public boolean isMember(String memId) {
		
//		MemberDto memberDto = db.get(memId);
		
		return db.get(memId) != null ? true : false;
	}
	
//	사용자 정보를 db에 주입
	public int insertNewMember(MemberDto memberDto) {
		
		db.put(memberDto.getMemId(), memberDto);
		
		return db.get(memberDto.getMemId()) != null ? 1 : 0;
	}
	
//	사용자가 입력한 ID, PW와 DB의 데이터를 비교
	public MemberDto searchMemberByMemIdAndMemPw(MemberDto memberDto) {
		
		MemberDto dto = db.get(memberDto.getMemId());
		
		if (dto != null && dto.getMemPw().equals(memberDto.getMemPw())) {
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
