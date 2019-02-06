package com.example.demo.home;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.StoryService;

@Controller
public class StoryController {
	@Autowired
	private StoryService storyService;
	
	@RequestMapping("/addstory")
	public String addStory(Model model, @RequestParam("name") String name, @RequestParam("age") int age, @RequestParam("title") String title,
			@RequestParam("content") String content) {
		storyService.saveStory(name, age, title, content, new Date());
		model.addAttribute("stories", storyService.getStories());
	return "index.html";
		
		
	}
}
