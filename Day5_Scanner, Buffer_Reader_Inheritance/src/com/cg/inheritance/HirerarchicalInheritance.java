package com.cg.inheritance;
// Hierarchical Inheritance
class Animal 		//Parent class
{
void eat()
{
	System.out.println("eating");
	
}
}
class Dog extends Animal{	 //child class
	void Bark() {
	System.out.println("Barking");
	}
	}
class Cat extends Animal{	//child class
	void Meow() {
		System.out.println("Meowing");
	}
}


public class HirerarchicalInheritance {

	public static void main(String[] args) {
	
		Dog A=new Dog();
		A.eat();
	//	A.meow   for Cat
		A.Bark();
	
	}

}