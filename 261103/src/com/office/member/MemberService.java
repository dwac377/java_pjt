package com.office.member;

public class MemberService implements IMemberService{
	
//	MemberDao memberDao = new MemberDao();
	
	
	final private MemberDao memberDao;
	
	public MemberService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	@Override
	public void signUp(MemberDto memberDto) {
		
		boolean isMember = memberDao.isMember(memberDto.getMemId());
		
		if (!isMember) {
			
			int result = memberDao.insertNewMember(memberDto);
			
			if (result == 0) {
				System.out.println("회원가입에 실패하였습니다. 잠시후 시도해주십시오");
			} else {
				System.out.println("회원가입에 성공하였습니다.");
			}
		}  else {
			System.out.println("이미 존재하는 아이디입니다.");
		}
		
	}

	@Override
	public void signIn(MemberDto memberDto) {
		
		MemberDto searchedMemberDto =
				memberDao.searchMemberByMemIdAndMemPw(memberDto);
		
		if (searchedMemberDto != null) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
	}

	@Override
	public void modify(MemberDto memberDto) {
		
		MemberDto updatedMemberDto = memberDao.updateMemberByMemId(memberDto);
		
		if (updatedMemberDto != null) {
			System.out.println("완료");
		} else {
			System.out.println("실패");
		}
		
	}

	@Override
	public void delete(MemberDto memberDto) {
		
		MemberDto deletedMemberDto = memberDao.deleteMemberByMemIdAndMemPw(memberDto);
		
		if (deletedMemberDto != null) {
			System.out.println("삭제 완료");
		} else {
			System.out.println("존재하지 않다");
		}
		
	}
	
	

	

	public boolean doAuthenticationByMemIdAndMempw(MemberDto memberDto) {
		
		MemberDto dto = memberDao.searchMemberByMemIdAndMemPw(memberDto);

		return dto != null ? true : false;
	}
	
	
	
//	private static MemberService memberService = new MemberService();
//	
//	public static MemberService getMemberService() {
//		
//		if (memberService == null) {
//			return memberService;
//		}
//		
//		return memberService;
//	}	

}
