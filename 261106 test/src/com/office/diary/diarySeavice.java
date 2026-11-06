package com.office.diary;

import java.util.ArrayList;

import com.office.DB.diaryDao;
import com.office.DB.dto;

public class diarySeavice {
	diaryDao diaryDao = new diaryDao();
	
	public void addDiary(dto dto) {
		
	diaryDao.insertDiary(dto);
		
	}
	
	public void reedDiares() {
		
		ArrayList<String> diaries = diaryDao.getDiaries();
		
		for (String diariss : diaries) {
			System.out.println(diariss);
		}
	}

}
