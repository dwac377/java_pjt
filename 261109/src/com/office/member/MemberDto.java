package com.office.member;

public class MemberDto {
	
	private String memId;
	private String memPw;
	private String memEmail;
	private String memPhone;
	
//	private boolean active = true;
	
	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	public MemberDto(String memId, String memPw, String memEmail, String memPhone) {

		this.memId = memId;
		this.memPw = memPw;
		this.memEmail = memEmail;
		this.memPhone = memPhone;
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

	public String getMemPhone() {
		return memPhone;
	}

	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}
}
