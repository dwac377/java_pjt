package com.office.diary;
import java.util.ArrayList;
import java.util.Scanner;

import com.office.session.Session;

public class DiaryController {
	
	final private DiaryService diaryService;
	
	public DiaryController(DiaryService diaryService) {
		this.diaryService = diaryService;
	}

	public void execute(Scanner sc, int selectedMenu) {
		String diaryTitle;
		String diaryBody;
		
		switch (selectedMenu) {
		
		case com.office.menu.Menu.DIARY_WRITE:
			sc.nextLine();
			System.out.println("일기의 제목을 입력하세요");
			diaryTitle = sc.nextLine();
			
			System.out.println("일기의 내용을 입력하세요");
			diaryBody = sc.nextLine();
			
			DiaryDto diaryDto = new DiaryDto(diaryTitle, diaryBody);
			int resultForWrite = diaryService.writeDiary(
				    String.valueOf(
				        Session.getInstance().getAttribute(com.office.config.Config.SIGNINED_MEMBER_ID)
				    ),
				    diaryDto
				);
			
			if (resultForWrite == DiaryService.DIARY_WRITE_SUCCESS) {
				System.out.println("저장 완료");
			} else {
				System.out.println("저장 실패");
			}
			
			break;
			
		case com.office.menu.Menu.DIARY_READ:
			
			ArrayList<DiaryDto> myDiaries = diaryService.readDiaries(
					String.valueOf(Session.getInstance().getAttribute(com.office.config.Config.SIGNINED_MEMBER_ID))
					);
			
			
			
			
			if (myDiaries != null) {
				for (int i=0; i < myDiaries.size(); i++) {
					DiaryDto dto = myDiaries.get(i);
					System.out.println("------------------------");
					System.out.println("제목:" + dto.getDiaryTitle());
					System.out.println("내용:" + dto.getDiaryBody());
					System.out.println("------------------------");
				}
			} else {
				System.out.println("작성된 일기가 없어요");
			}
			
			break;

		default:
			break;
		}
		
	}



}
