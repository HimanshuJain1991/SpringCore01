package com.rays.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("AutoWiring.xml");
		Company com=(Company)context.getBean("company");
   com.companyWork();


	}

}
