package com.collections;

import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/collections/beans.xml");
		Department dp = (Department) ac.getBean("department");
		Stream.of(dp.getEmpName()).forEach(x -> System.out.println(x));
		Arrays.stream(dp.getEmpName()).forEach(x -> System.out.println(x));
		dp.getEmpList().forEach( e -> System.out.println(e.getName()) );
		dp.getEmpSet().forEach( e -> System.out.println(e.getName()) );
		dp.getEmpMap().forEach( (k, v) -> System.out.println(k + ": " + v.getName()) );
		dp.getEmpMap().entrySet().forEach( e -> System.out.println(e.getKey() + ": " + e.getValue().getName()) );
	}

}
