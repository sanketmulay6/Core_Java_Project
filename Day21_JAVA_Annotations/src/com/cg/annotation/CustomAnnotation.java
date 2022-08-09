package com.cg.annotation;
//Custom Annotations 
@interface Custom
{
	//Abstract method
	String print();
	}
class B{
	@Custom(print="Hello Student")
	public void display() 
	{
		
		System.out.println("It's Holiday");
	}
}

public class CustomAnnotation {

	public static void main(String[] args) {
		B b= new B();
		b.display();
 

	}

}