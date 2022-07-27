package com.cg.polymorphism;
//having the different type of argument.
class A{
	void add(int a,int b) {	
		System.out.println(a+b);
	}
void add(float a, float b) {
	System.out.println(a+b);
}	
}
public class compile_time {

	public static void main(String[] args) {
		A a=new A();
		a.add(10, 20);
		a.add(20.8f, 15.6f);

	}

}