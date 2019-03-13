package com.test;

import com.service.UserService;
import com.util.ApplicationContextUtil;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		((UserService)ApplicationContextUtil.
				getApplicationContext().getBean("userService")).sayHello();
		
	}

}

/** Q; What is IoC
 *  A: IoC is Inverse of Control. Move the right of creating an object and maintaining an object from program to spring container (applicationContext.xml). Program itself does not need to be maintained anymore.
 *  
 *  Q: What is DI
 *  A: DI (Dependency Injection): Actually DI and IoC are the same concept. The designers of spring think that DI can express the core of spring.
 * 
 */
