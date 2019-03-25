package com.inherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/inherit/beans.xml");
		Graduate g = (Graduate) ac.getBean("graduate");
		System.out.println(g.getName() + " " + g.getAge() + " " + g.getDiploma());
	}

}
