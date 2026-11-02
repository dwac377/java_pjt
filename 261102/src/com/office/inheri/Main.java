package com.office.inheri;

import com.office.inheri.Restaurant.ChildRes;
//import com.office.inheri.Restaurant.ParentRestaurant;

public class Main {

	public static void main(String[] args) {
		
//		ParentRestaurant parentRestaurant = 
//				new ParentRestaurant();
//		
//		parentRestaurant.makeJajang();
//		parentRestaurant.makeJjamppong();
		
		ChildRes chiledRes =
				new ChildRes();
		
		chiledRes.makeJajang(2);
		chiledRes.makeJjamppong();
		chiledRes.makeBokkeumbap();
		chiledRes.makeTangSuYuk();
		
		
	}
	
}
