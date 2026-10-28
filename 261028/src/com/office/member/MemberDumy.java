package com.office.member;

import javax.sound.midi.MetaMessage;

public class MemberDumy {
	
	MemberDB db;
	
	public MemberDumy(MemberDB memberDB) {
		this.db = memberDB;
	}
	
	public void initDumyData() {
		
		String[] memberIDs = {"1", "2", "3"};
		String[] memberPWs = {"11", "22", "33"};
		String[] memberEMAILs = {"1@1", "2@2", "3@3"};
		String[] memberPOHNEs = {"111", "222", "333"};
		
		for  (int i = 0; i < memberIDs.length; i++) {
			Member member = new Member(memberIDs[i], memberPWs[i], memberEMAILs[i], memberPOHNEs[i]);
			db.memberDB.put(memberIDs[i], member);
			member.printInfo();
			
		}
		
	}

}
