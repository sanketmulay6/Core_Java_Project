package com.cg.polymorphism;

class C{
	void display(int a,int b) {
		System.out.println(a+b);	
	}
} 
class B extends A{
	void display(int x,int y) {
		System.out.println(x+y);
	}
}
public class method_overloading {

	public static void main(String[] args) {
		C a=new C();
		a.display(5, 10);
		B b=new B();
		b.display(25,15);
	}

}