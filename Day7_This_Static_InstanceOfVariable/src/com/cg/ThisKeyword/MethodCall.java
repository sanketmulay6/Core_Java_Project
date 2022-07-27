
package com.cg.ThisKeyword;
//3.this keyword is passed as an argument to method call.
class A
{
	void print(A a) {
		System.out.println("Function 1 is invoked");
	}
	void display() {
		print(this);
	}
	}
public class MethodCall {

	public static void main(String[] args) {
		A a=new A();
		a.display();
	}

}