package com.cg.polymorphism;
//Constructor Overloading
class Triber{
	int speed;
	String Engine;
	Triber(){	//zero parameter 
		System.out.println("Renault-Kiger");
	}
	Triber(int speed,String Engine){	//two parameter
		this.speed=speed;
		this.Engine=Engine;
		System.out.println("speed is :"+speed+"km/hr");
		System.out.println("Engine type is :"+Engine);
	}
}

public class constructor_overloading {

	public static void main(String[] args) {
		Triber t=new Triber();
		Triber t1=new Triber(100, "Diesel");
	}

}