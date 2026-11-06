package com.office.diary;

import java.util.Scanner;

import com.office.DB.dto;

public class diaryMenu {
	
	public void diaryMeuns(Scanner sc) {
		diarySeavice diarySeavice = new diarySeavice();
		
		String text;
		dto dto;
		
		boolean sysF = true;
		
		while (sysF) {
			System.out.println("1. 일기 작성   2. 일기 목록   3. 로그아웃   4.회원 탈퇴");
			int selectMenu = sc.nextInt();
			
			switch (selectMenu) {
			
			
			case 1:
				System.out.println("일기 작성");
				text = sc.next();
				
				dto = new dto(text);
				
				diarySeavice.addDiary(dto);
				
				break;
				
			case 2:
				System.out.println("일기 목록");
				diarySeavice.reedDiares();
				
				break;
				
			case 3:
				System.out.println("로그아웃");
				sysF = false;
				
				break;
			case 4:
				System.out.println("회원 탈퇴");
				
				
				break;

			default:
				break;
			}
			
		}
		
		
		
	}

}
