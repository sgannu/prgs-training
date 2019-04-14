package com.prg.calendar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prg.calendar.service.EventService;

@Controller
public class CalendarController {

	// Dependency injection
	@Autowired
	EventService serviceInstance;

  @GetMapping("/greeting")
  public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
      Model model) {
    model.addAttribute("name", name);
    return "greeting";
  }
  
  @GetMapping("/calendar")
  public String calendarControl(Model model) {
	  
	  List eventsList = serviceInstance.getTodaysEvents();
	  
	  model.addAttribute("events", eventsList);
	  
	  return "calendar";
  }


}