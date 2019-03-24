package com.beanlife;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings({ "unused", "deprecation" })
public class BeanLife {
	
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/beanlife/beans.xml");
	//	BeanFactory bf = new XmlBeanFactory(new ClassPathResource("com/beanlife/beans.xml"));
		
		PersonService ps = (PersonService)ac.getBean("personService");
		PersonService ps2 = (PersonService)ac.getBean("personService2");
		ps.sayHi();
		ps2.sayHi();
	}
	
}
