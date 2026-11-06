package com.office.DB;

import java.util.HashMap;

public class MemberDao {
	
	HashMap<String, MemberDto> db = new HashMap<String, MemberDto>();
	
	public boolean isMemberIdTaken(String memId) {
		
		return db.get(memId) == null ? true : false;
		
	}
	
	
	public boolean insertMember(MemberDto memberDto) {
		
		db.put(memberDto.getMemId(), memberDto);
		
		return db.get(memberDto.getMemId()) != null ? true : false;
	}
	
	
	
	public void deleteMember(MemberDto memberDto) {
		
		
		
		
	}
	
	public MemberDto modifyMember(MemberDto memberDto) {
		
		db.put(memberDto.getMemId(), memberDto);
		
		return db.get(memberDto.getMemId());
		
	}


	public MemberDto searchMemberByMemIdAndMemPw(MemberDto memberDto) {
		
		MemberDto dto = db.get(memberDto.getMemId());
		
		if (dto != null && dto.getMemPw().equals(memberDto.getMemPw())) {
			return dto;
		} else {
			return null;
		}
		
	}

}
