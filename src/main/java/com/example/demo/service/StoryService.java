package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.Autor;
import com.example.demo.domain.Story;
import com.example.demo.repository.AutorRepository;
import com.example.demo.repository.StoryRepository;

@Service
public class StoryService {
	@Autowired
	StoryRepository storyRepo;
	@Autowired
	AutorRepository autorRepo;
	
	
	public List<Story> getStories() { 
		return storyRepo.findAll();
	}
	
	public void saveStory(@RequestParam("name") String name, @RequestParam("age") int age, @RequestParam("title") String title,
			@RequestParam("content") String content, @RequestParam("date") Date date) {
		Autor autor = new Autor(name, age);
		autorRepo.save(autor);
		Story story = new Story(title,content, new Date(), autor);
		storyRepo.save(story);
	}

	public StoryService(StoryRepository storyRepo) {
		super();
		this.storyRepo = storyRepo;
	}

	public StoryRepository getStoryRepo() {
		return storyRepo;
	}

	public void setStoryRepo(StoryRepository storyRepo) {
		this.storyRepo = storyRepo;
	}
}
