package com.office.member;

import java.util.HashMap;

import com.office.db.DiaryDb;

public class MemberDao {
	
	final private DiaryDb diaryDb;
	
	public MemberDao(DiaryDb diaryDb) {
		this.diaryDb = diaryDb;
	}

//	아이디 중복 체크 메서드
	public boolean isMember(String memId) {
//		매개 변수로 받은 id를 맴버 db에서 키 값 일치하는 정보가 있다면 불러온다
//		그렇게 불러온 정보가 없다면 null임으로 거짓을 반환한다 즉 중복이 아니다.
		HashMap<String, MemberDto> members = diaryDb.getMembers();
		MemberDto memberDto = members.get(memId);
		
		return memberDto != null ? true : false;
	}

//	회원 가입 메서드
	public int insertMember(MemberDto memberDto) {
		
//		매개 변수로 받은 memberDto의 값을 해시맵에 넣어준다
		HashMap<String, MemberDto> members = diaryDb.getMembers();
		members.put(memberDto.getMemId(), memberDto);
		
//		members에 데이터가 제대로 저장되었는지를 판독한다, 저장되었다면 !null
//		저장되지 않았다면 null이다 1 : 0 이 반환된다
		return members.get(memberDto.getMemId()) != null ? 
								MemberService.SIGN_UP_SUCCES 
								:
								MemberService.SIGN_UP_FALE;
	}

	public MemberDto selectMemberByMemID(String memId) {
		
//		매개 변수로 받은 아이디를 키 값으로 db에서 일치하는 데이터를 가져온다 있다면 !null
//		임으로 데이터가 불러와지고 없다면 null이다.
		HashMap<String, MemberDto> members = diaryDb.getMembers();
//		만일 데이터가 가져와졌다면 !null임으로 members 회원 정보를 반환해준다
		return members.get(memId) != null ? members.get(memId) : null;
	}
	
	
	public int updateMember(MemberDto memberDto) {
		

		HashMap<String, MemberDto> members = diaryDb.getMembers();
		members.put(memberDto.getMemId(), memberDto);
		

		return members.get(memberDto.getMemId()) != null ? 
								MemberService.MODIFY_SUCCES
								:
								MemberService.MODIFY_FALE;
	}

	public int deleteByMemberId(String memId) {
		
		HashMap<String, MemberDto> members = diaryDb.getMembers();
		members.remove(memId);
		
		return members.get(memId) == null 
				?
				MemberService.DELETE_SUCCES 
				:
				MemberService.DELETE_FALE;
	}

}
