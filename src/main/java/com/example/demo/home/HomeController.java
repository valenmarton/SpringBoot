package com.example.demo.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.StoryService;

@Controller
public class HomeController {
	@Autowired
	private StoryService storyService;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("stories", storyService.getStories());
		return "index.html";
	}
	
	
	
//		
//	Story story1 = new Story();
//	story1.setTitle("Hello");
//	story1.setContent("<b>Hi there my Fancso</b>");
//	story1.setLatestUpdated(new Date());
//
//	Story story2 = new Story();
//	story2.setTitle("Title");
//	story2.setContent("<b>Hi there Dino</b>");
//	story2.setLatestUpdated(new Date());
//	
//	stories.add(story1);
//	stories.add(story2);
//	return stories;
//	}
	
	}

