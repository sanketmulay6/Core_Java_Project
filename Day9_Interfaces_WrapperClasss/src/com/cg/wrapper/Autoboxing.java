package com.cg.wrapper;
//converting primitive types to its respective Wrapper classobject Autoboxing 
public class Autoboxing {

	public static void main(String[] args) {
		float x=15.5f;//primitive data
		Float a=x;//converting primitive to Wrapper class
		Float f = new Float(10);
		System.out.println(x+" "+a+" "+f);
	}

}