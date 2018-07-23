package com.wiring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-bean.xml");
		Customer customer = (Customer) ctx.getBean("cust");
		System.out.println(customer);
		
	}

}
