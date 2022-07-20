package com.cg.abstraction;
//Abstract class
abstract class fruit {
	abstract void display();
	
}
class apple{
	void display() {
		System.out .println("Apple is sweet.");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		apple a= new apple();
		a.display();
	}

}