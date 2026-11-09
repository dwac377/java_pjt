package com.office.home;
import java.util.Scanner;

import com.office.Container;

public class HomeController {

	public void execute() {
		
		Scanner sc = new Scanner(System.in);
		boolean sysF = true;
		
		while (sysF) {
			com.office.menu.Menu.generateMenu();
			int selectedMenu = sc.nextInt();
			
			switch (selectedMenu) {
//			홈 컨트롤러는 각 선택에 따라 맴버, 다이어리 컨트롤러로 보내주는 역할이다
//			실제 로그인, 읽기를 위한 로직은 홈 컨트롤러가 아닌 멤버, 다이어리 컨트롤러가 담당한다
//			따라서 각 로직을 담당하는 클래스로 이양한다
			case com.office.menu.Menu.MEMBER_SIGN_UP:		
			case com.office.menu.Menu.MEMBER_SIGN_IN:		
			case com.office.menu.Menu.MEMBER_SIGN_OUT:
			case com.office.menu.Menu.MEMBER_MODIFY:
			case com.office.menu.Menu.MEMBER_DELETE:
				Container.getInstance().
						getMemberController().
						execute(sc, selectedMenu);
				
				break;
				
			case com.office.menu.Menu.DIARY_WRITE:
			case com.office.menu.Menu.DIARY_READ:
				Container.getInstance().
						getDiaryController().
						execute(sc, selectedMenu);
				
				break;
				
			default:
				System.out.println("byby");
				sysF = false;
				break;
			}
		}
		sc.close();
	}
}
