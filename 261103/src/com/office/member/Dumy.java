package com.office.member;

public class Dumy {
	
	private String[] memIds = {"1", "2", "3"};
	private String[] memPws = {"111", "222", "333"};
	private String[] memEmils = {"123", "123", "123"};
	private String[] memPone = {"1221223", "1343323", "1243123"};
	
	public void sigUpForDumy(MemberService memberService) {
		
		for (int i = 0; i < memIds.length; i++) {
			MemberDto memberDto = new MemberDto(memIds[i], memPws[i], memEmils[1], memPone[1]);
			memberService.signUp(memberDto);
		}
		
		
	}
	

}
