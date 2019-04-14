package com.prg.calendar.service;

import com.prg.calendar.modal.Event;

import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EventService {

	
	public List getTodaysEvents() {
		
		ArrayList list = new ArrayList<Event>();
		
		
		Event event1 = new Event();
		event1.setTitle("First event!!");
		
		list.add(event1);
		
		return list;
	}

}
