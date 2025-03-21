package com.thymeleaf.practise.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ThymeleafController 
{
	@GetMapping("/about")
	public String about(Model model)
	{
		System.out.println("Inside about controller");
		
		//Sending data into about.html page using model
		model.addAttribute("name", "Aniket Singh");
		model.addAttribute("currentDate", new java.util.Date());
		return "about";
	}
	
	//IterateHandler
	@GetMapping("/iterate-example")
	public String iterateHandler(Model m)
	{
		System.out.println("Inside iterate handler.");
		
		//Create a list in controller
		List<String> names = List.of("Aniket","Vivek","Shyam","Kushnuma");
		m.addAttribute("names", names);
		
		return "iterate";
	}
	
	//ConditionHandler
	@GetMapping("/condition")
	public String conditionHandler(Model m)
	{
		System.out.println("Inside Condition Handler...");
		//Send active status using Model controller
		m.addAttribute("isActive", true);
		return "condition";
	}
	
	//Fragment in Thymeleaf
	@GetMapping("/service")
	public String service()
	{
		return "service";
	}

}
