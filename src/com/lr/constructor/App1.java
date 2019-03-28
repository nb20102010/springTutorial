package com.lr.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/constructor/beans.xml");
		Employee e = (Employee) ac.getBean("employee");
		Employee e2 = (Employee) ac.getBean("employee2");
		System.out.println(e.getName() + " " + e.getAge());
		System.out.println(e2.getName() + " " + e2.getAge());
	}

}
