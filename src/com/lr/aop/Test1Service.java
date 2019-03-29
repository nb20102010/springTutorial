package com.lr.aop;

public class Test1Service implements TestServiceInterface, TestServiceInterface2 {
	
	private String name;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello, " + this.name);
	}



	@Override
	public void sayBye() {
		// TODO Auto-generated method stub
		System.out.println("Byebye, " + this.name);
	}

}
