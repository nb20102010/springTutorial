package com.service;

public class UserService {
	
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void sayHello() {
		System.out.println("Hello, " + this.name);
	}
	
}
