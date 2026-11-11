package com.office.exception;

public class StringEx {
	
	public static void main(String[] args) {
		
//		스트링 버퍼
		StringBuffer stringBuffer = new StringBuffer("0123456789");
		System.out.println(stringBuffer);
		
//		문자열 추가
		stringBuffer.append(" 10");
		System.out.println(stringBuffer);
		
//		특정 위치에 추가 = 인덱스로 위치 특정
		stringBuffer.insert(5, "444");
		System.out.println(stringBuffer);
		
//		특정 범위 삭제 = 인덱스로 위치 특정
		stringBuffer.delete(5, 8);
		System.out.println(stringBuffer);
		
//		특정 문자 삭제
		stringBuffer.deleteCharAt(5);
		System.out.println(stringBuffer);
		
//		문자열 교체
		stringBuffer.replace(0, 3, "hi!");
		System.out.println(stringBuffer);
		
//		문자열 뒤집기
		stringBuffer.reverse();
		System.out.println(stringBuffer);
		
//		문자열 길이
		System.out.println(stringBuffer.length());
	}
}
