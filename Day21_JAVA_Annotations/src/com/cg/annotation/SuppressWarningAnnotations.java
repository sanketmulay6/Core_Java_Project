package com.cg.annotation;
class Animal{
	Animal(){
		System.out.println("Lion Roars");
	}
}

public class SuppressWarningAnnotations {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Animal a= new Animal();
	}

}