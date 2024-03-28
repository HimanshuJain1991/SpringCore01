package com.rays.dic;

public   class Bike {
//	String color;
//	public void showColor() {
//		System.out.println("color is="+color);
//	}
Engine engine;
public Bike(Engine engine) {
	this.engine=engine;

}
public void startEngine() {
	if(engine==null)
		System.out.println("engine not started");
	else
	engine.start();
}
}
