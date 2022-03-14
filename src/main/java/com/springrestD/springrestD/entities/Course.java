package com.springrestD.springrestD.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

//Step 45 - add the entity annotation 
@Entity
public class Course {
	// Step 5 - Declare variables 
	@Id          // add Id annotation for the primary key
	private long id;              
	private String title;
	private String description;
	
	// Step 6 - Source-> Generate constructor using Fields -> Select all -> Generate
	public Course(long id, String title, String description) {  
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	
	// Step 7 - Source-> Generate constructors From superclass -> Select all -> Generate
	// default constructor
	public Course() {               
		super();
		// TODO Auto-generated constructor stub
	}

	
	// Step 8 - Source-> Generate Getters and Setters -> Select all -> Generate
	public long getId() {             
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	// Step 9 - Source-> Generate toString() -> Select all -> Generate    (Step 10 in MyController.java) 
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", description=" + description + ", getId()=" + getId()
				+ ", getTitle()=" + getTitle() + ", getDescription()=" + getDescription() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
