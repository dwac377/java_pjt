package com.office.member;

public class MemberService {
	
	private final MemberDao memberDao;
	
	final public static int SIGN_UP_FALE = 0;
	final public static int SIGN_UP_SUCCES = 1;
	
	public MemberService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public int singUp(MemberDto memberDto) {
		
		boolean isMember = memberDao.isMember(memberDto.getMemId());
		
		if (!isMember) {
			return memberDao.insertMember(memberDto);
		} else {
			return SIGN_UP_FALE;
		}
		
		
	}

	public MemberDto singIn(MemberDto memberDto) {
//		매개 변수로 받은 memberDto의 아이디를 토대로 dao에서 일치하는 키 값의
//		데이터를 가져온다, 없으면 null 있다면 변수는 회원 정보를 참조하게 된다.
		MemberDto seletedMemberDto = 
				memberDao.selectMemberByMemID(memberDto.getMemId());
		
//		참조받은 회원 정보를 토대로 조건을 검사한다 만일 아이디가 있고 비밀번호가 같다면
//		로그인 성공이다.
		if (seletedMemberDto != null 
				&&
				seletedMemberDto.getMemPw().equals(memberDto.getMemPw())) {
			return seletedMemberDto;
		} else {
			return null;
		}

	}

}
