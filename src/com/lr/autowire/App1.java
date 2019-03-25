package com.lr.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lr/autowire/beans.xml");
		Host host = (Host) ac.getBean("host");
		System.out.println(host.getDog().getName());
	}

}
