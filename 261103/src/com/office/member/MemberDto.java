package com.office.member;

public class MemberDto {
	
	private String memId;
	private String memPw;
	private String memEmail;
	private String memPoneNum;
	
	
	public MemberDto(String memId, String memPw, String memEmail, String memPoneNum) {
		this.memId = memId;
		this.memPw = memPw;
		this.memEmail = memEmail;
		this.memPoneNum = memPoneNum;
	}
	
	public MemberDto() {
		// TODO Auto-generated constructor stub
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

	public String getMemPoneNum() {
		return memPoneNum;
	}

	public void setMemPoneNum(String memPoneNum) {
		this.memPoneNum = memPoneNum;
	}

}
