package com.service;

public class UserService {
	
	private String name;
	private ByeService b;

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
	
	public ByeService getB() {
		return b;
	}

	public void setB(ByeService b) {
		this.b = b;
	}

	public void sayHello() {
		System.out.println("Hello, " + this.name);
		this.getB().sayBye();
	}
	
}
