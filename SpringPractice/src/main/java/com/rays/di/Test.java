package com.rays.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("DepndInje.xml");
		Bike bike=ac.getBean("bike",Bike.class);
		bike.showColor();
	}
	
 
	

}
