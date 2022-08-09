package com.cg.lamexp;
//Functional Interface = which contain only one abstract method
interface B{
	//one- abstract methodParameterized
	String print(String str);
	
}

public class OneParameterizedFunctionalInterface {

	public static void main(String[] args) {
		//lambda exp
		B b=(String str)->{
			
			return str;
		};
		System.out.println(b.print("Lambda Expression"));
	}

}