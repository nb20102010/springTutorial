package com.lr.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lr/aop/beans.xml");
		TestServiceInterface t1s =  (TestServiceInterface) ac.getBean("proxyFactoryBean");
		t1s.sayHello();
		TestServiceInterface2 t2s = (TestServiceInterface2) t1s;
		t2s.sayBye();
	}

}
