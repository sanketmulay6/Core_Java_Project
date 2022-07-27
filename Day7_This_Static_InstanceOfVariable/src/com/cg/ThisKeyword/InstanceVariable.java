package com.cg.ThisKeyword;
//1.this keyword is used to refer the instance variable of class.
class fruit{
	private String str;
	private String str1;
	void accept(String str, String str1) {
		this.str="Apple";
		this.str1="Pineapple";
	}
	void display() {
		System.out.println("First string is :"+str);
		System.out.println("Second string is :"+str1);

	}

}
public class InstanceVariable {

	public static void main(String[] args) {
		fruit f=new fruit();
		f.accept("str","str1");
		f.display();

	}

}