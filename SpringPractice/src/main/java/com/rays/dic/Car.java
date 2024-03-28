package com.rays.dic;

public class Car {
	Engine engine;
	public Car(Engine engine) {
		this.engine=engine;
		
	}
	public void startEngine() {
		if(engine==null)
			System.out.println("engine not started");
		else
		engine.start();
	}


}
