package com.rays.inject_literals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("inject_literals.xml");
		Employee emp=ac.getBean("emp",Employee.class);
         emp.showDetails();
	}

}
