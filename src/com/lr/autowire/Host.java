package com.lr.autowire;

public class Host {

	private String name;
	private Dog dog;
	
	public Host() {}
	
	public Host(Dog dog) {
		// TODO Auto-generated constructor stub
		System.out.println("inject from constructor");
		this.dog = dog;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {		
		this.name = name;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		System.out.println("inject from set");
		this.dog = dog;
	}

}
