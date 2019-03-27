package com.lr.dispatch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lr/dispatch/beans.xml");
		DBUtil dbutil = (DBUtil) ac.getBean("dbUtil");
		System.out.println(dbutil.getDriverName());
		DBUtil dbutil2 = (DBUtil) ac.getBean("dbUtil2");
		System.out.println(dbutil2.getUrl());
	}

}
