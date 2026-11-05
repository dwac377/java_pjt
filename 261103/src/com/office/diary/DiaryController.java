package com.office.diary;

import java.util.Scanner;

public class DiaryController implements Config {
	
	final DiaryService diaryService;
	
	public DiaryController(DiaryService diaryService) {
		this.diaryService = diaryService;
	}
	
	public void execute() 
	{
		Scanner sc = new Scanner(System.in);
		boolean systemFlag = true;
		
		while (systemFlag) {
			System.out.println("1.쓰기   2. 읽기   3.나가기");
			int selectMenu = sc.nextInt();
			
			switch (selectMenu) {
			case DIARY_WRITE:
				
				sc.nextLine();
				
				System.out.println("일기를 작성하시오!");
				String txt = sc.nextLine();
				
				DiaryDto diaryDto = new DiaryDto(txt);
				
				diaryService.writeNewDiary(diaryDto);
				
				break;
				
			case DIARY_READ:
				
				diaryService.reedDiares();
				
				break;
				
			case SYSTEM_OUT:
				System.out.println("qqq222");
				systemFlag = false;
				break;

			default:
				break;
			}
			
			
			
		}
		
		
		sc.close();
		
	}
	
	

}
