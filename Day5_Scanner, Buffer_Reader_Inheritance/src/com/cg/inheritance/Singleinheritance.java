package com.cg.inheritance;
// Single Inheritance
class Car
{
	void speed()
	{
		System.out.println("BMW is fast");
	}
	}
class Bmw extends Car{//child class is extended here
	void Look() {
		System.out.println("Bmw Looks Beautiful");
	}
}
public class Singleinheritance {

	public static void main(String[] args) {
	Bmw b= new Bmw();
	b.Look();
	b.speed();
		
	}

}