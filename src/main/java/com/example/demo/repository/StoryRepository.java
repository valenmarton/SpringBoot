package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Story;

public interface StoryRepository extends CrudRepository<Story, Long> {
	List<Story> findAll();

}
