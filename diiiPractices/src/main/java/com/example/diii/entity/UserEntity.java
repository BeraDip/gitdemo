package com.example.diii.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserEntity {
	
	private String name;
	private String clas;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserEntity(String name, String clas, int id) {
		super();
		this.name = name;
		this.clas = clas;
		this.id = id;
	}

	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
