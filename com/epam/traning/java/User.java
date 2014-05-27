package com.epam.traning.java;

import java.util.*;

public class User{

	private  String name;
	private String phone;
	private Integer id;

	public User(String name, String phone, Integer id) {
		this.name = name;
		this.phone = phone;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}
	public Integer getId() {
		return id;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + " ");
		sb.append(phone + " ");
		sb.append(id);
		return sb.toString(); 
	}

	@Override
	public boolean equals(Object o) {
    		User a = (User)o;
		return a.getId() == this.id;
	}

	@Override
	public int hashCode() {
		return id.hashCode();	
	}		
	
	
}

