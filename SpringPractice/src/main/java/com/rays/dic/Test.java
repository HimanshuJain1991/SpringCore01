package com.rays.dic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("DepndInje_Constructor.xml");
		Bike bike=ac.getBean("bike",Bike.class);
	bike.startEngine();
//	bike.showColor();
//	Bike bike1=ac.getBean("bike",Bike.class);
//	bike1.color="Yellow";
//	bike.startEngine();
//	bike.showColor();
	
	Car car=ac.getBean("car",Car.class);
	car.startEngine();
	}
	
 
	

}
