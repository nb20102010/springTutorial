package com.lr.beanlife;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class PersonService implements BeanNameAware,BeanFactoryAware,ApplicationContextAware, InitializingBean, DisposableBean {
	
	private String name;
	private int age;
	
	public PersonService() {
		System.out.println("1. Constructor 1 is executed.");
	}
	
	public PersonService(String name, int age) {
		System.out.println("1. Constructor 2 is executed.");
		this.name = name;
		this.age = age;
	}
	
	public PersonService(int age, String name) {
		System.out.println("1. Constructor 3 is executed.");
		this.name = name;
		this.age = age;
	}	

	public PersonService(int age) {
		System.out.println("1. Constructor 4 is executed.");
		this.age = age;
	}
	
	public PersonService(String name) {
		System.out.println("1. Constructor 5 is executed.");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("2. setName() is executed.");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void sayHi() {
		System.out.println("Hello, " + this.name);
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("3. setBeanName() is executed. Bean id is: " + name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("4. setBeanFactory() is executed. Bean Factory is: " + beanFactory);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("5. setApplicationContext() is executed. ApplicationContext is: " + applicationContext.getDisplayName());

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("7. afterPropertiesSet() is executed.");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("8. My own init method");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("9. free resource");
	}
}
