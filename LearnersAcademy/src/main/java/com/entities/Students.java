package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Students {

	
	@Id @GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name="fname")
	private String fname;
	
	@Column(name="lname")
	private String lname;
	
	@Column(name="age")
	private int age;
	
	
	@Column(name="section")
	private int section;
	
	//@Column(name="assignedclass")
	//private int aclass;
	
	public Students(int id, String fname, String lname, int age, int aclass) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		//this.aclass = aclass;
	}

	
	
	public int getSection() {
		return section;
	}



	public void setSection(int section) {
		this.section = section;
	}



	public Students() {
		
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
/*
	public int getAclass() {
		return aclass;
	}

	public void setAclass(int aclass) {
		this.aclass = aclass;
	}
	*/
	
}
