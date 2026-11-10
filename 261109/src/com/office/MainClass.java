package com.office;

import com.office.config.Config;
import com.office.dumy.Dumy;

public class MainClass {
	
	public static void main(String[] args) {
		
		Container container = Container.getInstance();
		
		if (Config.IS_DEV) 
			new Dumy().setDumy();
		
		
		container.gethomeController().execute();
		
	}

}
