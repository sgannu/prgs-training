package com.prg.calendar.service;

import com.prg.calendar.modal.Event;
import java.utils.ArrayList;

public class EventService {

	
	public List getTodaysEvents() {
		
		ArrayList list = new ArrayList<Event>();
		
		
		Event event1 = new Event();
		event1.setTitle("First event!!");
		
		list.add(event1);
		
		return list;
	}

}
