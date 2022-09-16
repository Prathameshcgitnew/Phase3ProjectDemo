package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subjects")
public class Subjects {
     
	@Id @GeneratedValue
	@Column(name="ID")
	private int id;
	
	@Column(name="subjectname")
	private String name;
	
	@Column(name="shortcut")
	private String shortcut;
	
	
	public Subjects(int id, String name, String shortcut) {
		super();
		this.id = id;
		this.name = name;
		this.shortcut = shortcut;
	}
	
	
	public Subjects() {
	
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortcut() {
		return shortcut;
	}
	public void setShortcut(String shortcut) {
		this.shortcut = shortcut;
	}
	
	
}
