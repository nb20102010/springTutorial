package com.lr.inter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/hsp/inter/beans.xml");
		changeLetterCase clc = (changeLetterCase)ac.getBean("changeLetter");
		System.out.println(clc.change());
		
		Student stu1 = (Student)ac.getBean("student1");
		Student stu2 = (Student)ac.getBean("student1");
		stu1.print();
		stu2.print();
		
		stu1 = (Student)ac.getBean("student2");
		stu2 = (Student)ac.getBean("student2");
		stu1.print();
		stu2.print();
	}
	
}
