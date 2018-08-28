package com.qa.account;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column (name = "first_name")
	private String firstName;
	
	@Column 
	private String surname;
	
	public Account () {}

	public Account(Integer id, String firstName, String surName) {
		this.id = id;
		this.firstName = firstName;
		this.surname = surName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surname;
	}

	public void setSurName(String surName) {
		this.surname = surName;
	}
	
	

}











