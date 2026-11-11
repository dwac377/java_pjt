package com.office.exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class CollectionEx {
	
	public static void main(String[] args) {
		
//		ArrayList : 배열의 업그레이드 버전
		
//		ArrayList<Integer> nums = new ArrayList<Integer>();
		java.util.List<Integer> nums = new ArrayList<Integer>();
		
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		System.out.println(nums);
		
		nums.remove(0);		
		nums.remove(1);
		System.out.println(nums);
		
		nums.add(0, 10);
		System.out.println(nums);
		
		nums.clear(); // 리스트 객체만 남기고 데이터는 삭제
		
//		Array -> Vector -> ArrayList
//		Array : 배열은 배열의 크기를 처음 지정한 만큼만 쓸수 있어서 불편
//		Vector : 배열의 크기가 유동적이나 동기화 문제로 느림
//		ArrayList : 배열의 크기가 유동적이고 동기화가 안 되어 있어 빠름
		
//		어레이리스트와 동일한 메서드 사용 즉 같은 인터페이스
//		Vector<Integer> nums2 = new Vector<Integer>();
		java.util.List<Integer> nums2 = new Vector<Integer>();
		
		nums2.add(10);
		nums2.add(20);
		nums2.add(30);
		nums2.add(40);
		
		nums2.remove(0);
		nums2.remove(1);
		
		nums2.add(0, 10);
		
		nums2.clear();
		
//		리스트나 맵을 선언 할때 각 백터, 어레이 리스트는 리스트라는 인터페이스에 종속되어 있다
//		따라서 객체를 만들때 데이터 타입을 상위 인터페이스로 하면 코드의 유연성이 향상된다.
		HashMap<String, String> bobo = new HashMap<String, String>();
		Map<String, String> bobobo = new HashMap<String, String>();
	}
}
