package com.rays.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Engine eng=(Engine)context.getBean("engine");
		eng.start();

	}

}
