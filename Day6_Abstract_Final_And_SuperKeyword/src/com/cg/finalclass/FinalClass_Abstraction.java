package com.cg.finalclass;
//Final class example
abstract class animal{
	abstract void display();
}
final class dog extends animal{		//final class is used
	void display() {
		System.out.println("Dog's are Herbivores");
	}
}

public class FinalClass_Abstraction {

	public static void main(String[] args) {
		dog d=new dog();
		d.display();
	}

}