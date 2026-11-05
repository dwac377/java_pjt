package com.office.diary;

import java.util.ArrayList;

public class DiaryService {
	
	final private DiaryDao diaryDao;
	
	public DiaryService(DiaryDao diaryDao) {
		this.diaryDao = diaryDao;
	}
	
	public void writeNewDiary(DiaryDto diaryDto) {
		
		boolean result = diaryDao.insertDiary(diaryDto);
		
		if (result) {
			
		}
		
	}

	public void reedDiares() {
		
		ArrayList<String> diaries = diaryDao.getDiaries();
		
		for (String diariss : diaries) {
			System.out.println(diariss);
		}
	}

}
