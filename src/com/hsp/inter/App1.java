package com.hsp.inter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/hsp/inter/Beans.xml");
		changeLetterCase clc = (changeLetterCase)ac.getBean("changeLetter");
		System.out.println(clc.change());
	}
	
}
