package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="class")
public class Class {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@Column(name="section")
	private int section;
	
	@Column(name="teacher")
	private String teacher;
	
	@Column(name="subject")
	private String subject;
	
	@Column(name="time")
	private String time;
	
	
	public Class(int id, int section, String teacher, String subject, String time) {
		super();
		this.id = id;
		this.section = section;
		this.teacher = teacher;
		this.subject = subject;
		this.time = time;
	}
	
	public Class() {}
	@Override
	public String toString() {
		return "Class [id=" + id + ", section=" + section + ", teacher=" + teacher + ", subject=" + subject + ", time="
				+ time + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSection() {
		return section;
	}
	public void setSection(int section) {
		this.section = section;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTime() {
		return time;
	}							
	public void setTime(String time) {
		this.time = time;
	}
	
	
}
