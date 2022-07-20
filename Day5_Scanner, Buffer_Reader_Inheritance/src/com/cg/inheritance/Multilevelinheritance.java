package com.cg.inheritance;
//Multilevel; Inheritance
class One{
	void welcom() {
		System.out.println("Welcome");
	}
}
class Two extends One{
	void to() {
		System.out.println("TO");
	}
}
class Three extends One{
	void eclipse() {
		System.out.println("Eclipse");
	}
}
public class Multilevelinheritance {

	public static void main(String[] args) {
		
		One T= new One();
		T.welcom();
		//T.();
		//T.eclipse()
	}

}