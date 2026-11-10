package com.office.db;

import java.util.ArrayList;
import java.util.HashMap;
import com.office.diary.DiaryDto;
import com.office.member.MemberDto;

public class DiaryDb {
	
//	싱글턴 패턴
	private static DiaryDb diaryDb;

	final private HashMap<String, MemberDto> members;
	final private HashMap<String, ArrayList<DiaryDto>> diaries;
	final private HashMap<String, MemberDto> deleteMembers;
	
	private DiaryDb() {
		members = new HashMap<String, MemberDto>();
		diaries = new HashMap<String, ArrayList<DiaryDto>>();
		deleteMembers = new HashMap<String, MemberDto>();
	}
	
	
	public static DiaryDb getInstance() {
		
		if (diaryDb == null) {
			diaryDb = new DiaryDb();
		}
		return diaryDb;
	}


	public HashMap<String, MemberDto> getMembers() {
		return members;
	}


	public HashMap<String, ArrayList<DiaryDto>> getDiaries() {
		return diaries;
	}


	public HashMap<String, MemberDto> getDeleteMembers() {
		return deleteMembers;
	}
	
	
	
	
}
