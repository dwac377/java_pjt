package com.office.DB;

public class MemberDto {
	
	private String memId;
	private String memPw;
	private String memEmail;
	
	
	public MemberDto(String memId, String memPw, String memEmail) {
		this.memId = memId;
		this.memPw = memPw;
		this.memEmail = memEmail;
	}



	public String getMemId() {
		return memId;
	}


	public void setMemId(String memId) {
		this.memId = memId;
	}


	public String getMemPw() {
		return memPw;
	}


	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}


	public String getMemEmail() {
		return memEmail;
	}


	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}
	
	
	
	

}
