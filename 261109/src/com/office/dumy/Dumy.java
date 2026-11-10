package com.office.dumy;
import com.office.member.MemberDto;

public class Dumy {
	
	private String[] memIds = {"1", "2"};
	private String[] memPws = {"1", "2"};
	private String[] memEmails = {"1", "2"};
	private String[] memPhones = {"1", "2"};
	
	public void setDumy() {
		
		for (int i = 0; i < memIds.length; i++) {
			
			MemberDto memberDto = new MemberDto
					(memIds[i], memPws[i], memEmails[i], memPhones[i]);
			
			com.office.Container.getInstance().getMemberDao().insertMember(memberDto);
					
			
		}
		
	}

}
