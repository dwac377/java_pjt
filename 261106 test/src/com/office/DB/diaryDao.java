package com.office.DB;

import java.util.ArrayList;

public class diaryDao {
	
	ArrayList<String> db = new ArrayList<String>();
	
	public void insertDiary(dto dto) {
		
		db.add(0, dto.getText());
		
	}
	
	 public ArrayList<String> getDiaries() {
		 return db;
	 }
	


}
