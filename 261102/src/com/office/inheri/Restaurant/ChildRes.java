package com.office.inheri.Restaurant;

public class ChildRes 
		extends ParentRestaurant  
		implements ChekList, ChekList2 {
			
	public void makeBokkeumbap() {
		
		System.out.println("칠드레 보큼바");
		
	}
	
	public final int OLD = 1;
	public final int NEW = 2;
	
//	@Override
	public void makeJajang(int menu) {
		
		if (menu == OLD) {
			super.makeJajang();
		} else {
			System.out.println("석시딩 유.. 자장");
		}
		
	}
	
	@Override
	public void makeTangSuYuk() {
		
		System.out.println("곱게 내줄 것이지!");
		
	}

	@Override
	public void checkFloor() {
		
		
	}

	@Override
	public void checkToilet() {
		
		
	}

	@Override
	public void checkHwagu() {
		
	}

}
