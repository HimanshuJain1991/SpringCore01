package com.rays.ioc;

public class Car  implements Engine{

	@Override
	public void start() {
		System.err.printf("Car Has Been Start");
	}

}
