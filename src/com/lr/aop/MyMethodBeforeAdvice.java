package com.lr.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyMethodBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("logging..." + method.getName());
	}

}
