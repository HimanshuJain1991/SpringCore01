package com.rays.di;

public   class Bike {
String color ;
//public  void setColor(String color) {
//	this.color=color;
//}
//public String getColor() {
//	return color;
//}
public Bike(String color) {
	this.color=color;
	System.out.println("constructor");
}
public void showColor() {
	System.out.println("Show Color"+color);
}
}
