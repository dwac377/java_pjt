package com.office.exception;

public class StringBuilderEx {
	
	public static void main(String[] args) {
		
		String str = "";
		
		long beforeCurrentTime = System.currentTimeMillis();
		
		for (int i = 0; i < 1000000; i++) {
			str += "s";
		}
		
		long afterCurrentTime = System.currentTimeMillis();
		System.out.println(afterCurrentTime - beforeCurrentTime);
	
	
	
		StringBuilder stringBuilder = new StringBuilder();
	
		long beforeCurrentTime2 = System.currentTimeMillis();
	
		for (int i = 0; i < 1000000; i++) {
			stringBuilder.append("s");
		}
	
		long afterCurrentTime2 = System.currentTimeMillis();
		System.out.println(afterCurrentTime2 - beforeCurrentTime2);

	}
}