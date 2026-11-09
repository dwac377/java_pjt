package com.office;

import com.office.db.DiaryDb;
import com.office.diary.DiaryController;
import com.office.diary.DiaryDao;
import com.office.diary.DiaryService;
import com.office.home.HomeController;
import com.office.member.MemberController;
import com.office.member.MemberDao;
import com.office.member.MemberService;

public class Container {
	
//	싱글턴 패턴 만들기
//	각 객체를 담아줄 변수들을 미리 선언해둔다 초기화는 생성자를 통해 한다.
	private static Container container;
	
	final private HomeController homeController;
	
	final private DiaryController diaryController;
	final private DiaryService diaryService;
	final private DiaryDao diaryDao;
	
	
	final private MemberController memberController;
	final private MemberService memberService;
	final private MemberDao memberDao;
	
	
	private Container() {
		this.homeController = new HomeController();
		
//		각 객체는 필요로 하는 객체를 매개 변수에 넣어 한번에 불러온다
//		서비스는 dao를 컨트롤러는 서비스를 함께 참조하게 한다.
		this.memberDao = new MemberDao(DiaryDb.getInstance());
		this.memberService = new MemberService(this.memberDao);
		this.memberController = new MemberController(this.memberService);
		
		this.diaryDao = new DiaryDao(DiaryDb.getInstance());
		this.diaryService = new DiaryService(this.diaryDao);
		this.diaryController = new DiaryController(this.diaryService);
	}
	
//	싱글턴 패턴에서 객체를 딱 하나 만들기 위한 메서드이다
//	컨테이너 객체가 없을 시 딱 하나를 만들고 컨테이터 객체는 상수로 설정되어 있어 이후 변경이 안 된다
	public static Container getInstance() {
		
		if (container == null) {
			container = new Container();
		}
		return container;
	}
	
	
//	상수로 지정된 것들을 바꿀 순 없기에 이 경우 세터는 생성되지 않는다.
	public HomeController gethomeController() {
		return homeController;
	}
	public DiaryController getDiaryController() {
		return diaryController;
	}
	public DiaryService getDiaryService() {
		return diaryService;
	}
	public DiaryDao getDiaryDao() {
		return diaryDao;
	}

	public MemberController getMemberController() {
		return memberController;
	}
	public MemberService getMemberService() {
		return memberService;
	}
	public MemberDao getMemberDao() {
		return memberDao;
	}
}
