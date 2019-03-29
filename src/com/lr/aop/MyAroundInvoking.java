package com.lr.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAroundInvoking implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Before executing the method..." + invocation.getMethod().getName());
		Object obj = invocation.proceed();
		System.out.println("After executing the method..." + invocation.getMethod().getName());
		return null;
	}


}
