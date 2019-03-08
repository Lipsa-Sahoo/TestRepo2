package com.ApiFramePractice1;

import java.util.List;
import java.util.Map;
//dummy books
public class DummyBooks {
	private int id;
	private String title;
	private String author;
	private List<String> skills;
	private Map<String, String> authorDetails;
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public List<String> getSkills() {
		return skills;
	}
	public Map<String, String> getAuthorDetails() {
		return authorDetails;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public void setAuthorDetails(Map<String, String> authorDetails) {
		this.authorDetails = authorDetails;
	}
}
