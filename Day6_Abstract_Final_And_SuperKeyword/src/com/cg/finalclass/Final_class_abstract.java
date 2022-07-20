package com.cg.finalclass;
//final abstract class
abstract class fruit{// class can't be a abstract or final at a time.
	abstract void display();
}

class apple extends fruit{
	 void display() {
		 System.out.println("apple is sweet");
	 }
	 
}
public class Final_class_abstract {

	public static void main(String[] args) {
		apple a= new apple();
		a.display();
	}

}