package com.office.session;

import java.util.HashMap;

public class Session {
//	섹션은 로그인 상태를 구분 짓는 스테이트를 의미한다
//	즉 하나의 섹션만 존재해야 하며 따라서 싱슬턴 패턴으로 만든다.
	private static Session session;
	
	final private HashMap<String, Object> attributies;
	
	private Session() {
		this.attributies = new HashMap<String, Object>();
	}
	
	public static Session getInstance() {
		if (session == null) {
			session = new Session();
		}
		return session;
	}

	public Object getAttribute(String name) {
		
		return attributies.get(name);
	}
	
//	세터와 비슷하나 객체를 새로 만드는 것이 아닌 이미 있는 개체에 데이터를 넣어주는 것
	public void setAttribute(String name, Object object) {
		attributies.put(name, object);
	}
	
	public void removeAttribute(String name) {
		attributies.remove(name);
		
	}
}
