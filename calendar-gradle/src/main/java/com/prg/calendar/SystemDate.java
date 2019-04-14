package com.prg.calendar;

import java.util.Date;

public class SystemDate {
	void getPresentDate() {
		System.out.println("SystemDate :getPresentDate START");
		
		Date presentDay= new Date();
		System.out.println(presentDay);
		

		System.out.println("SystemDate :getPresentDate END");
	}

}
