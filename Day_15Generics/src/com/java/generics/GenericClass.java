package com.java.generics;

public class GenericClass <T>{
	T num;
	void display() {
		System.out.println(num.getClass().getName());
	}

	public static void main(String[] args) {
		GenericClass<Object> g= new GenericClass<Object>();
		g.num="Raj ";
		g.display();

	}

}