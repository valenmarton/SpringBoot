package com.example.demo.domain;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Story {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long id;
	public String title;
	public String content;
	public Date latestUpdated;
	@ManyToOne
	private Autor autor;
	
	public Story() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Story(String title, String content, Date latestUpdated, Autor autor) {
		super();
		this.title = title;
		this.content = content;
		this.latestUpdated = latestUpdated;
		this.autor = autor;
	}
	public Date getLatestUpdated() {
		return latestUpdated;
	}
	public void setLatestUpdated(Date latestUpdated) {
		this.latestUpdated = latestUpdated;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
}
