package com.office.member;

public class MemberService implements IMemberService{
	
	MemberDao memberDao = new MemberDao();

	@Override
	public void signUp(MemberDto memberDto) {
		
		boolean isMember = MemberDao.isMember(memberDto.getMemId());
		
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
	public void signIn() {
		
		
		
	}

	@Override
	public void modify() {
		
		
		
	}

	@Override
	public void delete() {
		
		
		
	}
	
	
	public MemberService() {
		// TODO Auto-generated constructor stub
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
