package com.beanlife;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class myBeanPostProcessor implements BeanPostProcessor {
	
	public Object postProcessAfterInitialization(Object arg0, String arg1) {
		System.out.println("6.2. postProcessAfterInitialization() is executed. " + arg1);
		return arg0;
	}
	
	public Object postProcessBeforeInitialization(Object arg0, String arg1) {
		System.out.println("6.1. postProcessBeforeInitialization() is executed. " + arg1);
		return arg0;
	}
	
}
