package com.cg.ThisKeyword;
//4. this class keyword is used to return current class instance.
public class ClassInstance {
	int a;
	int b;
	ClassInstance(){
		int a= 10;
		int b=20;
	}

 ClassInstance get() {
	return this;
}
 void display() {
	 System.out.println("a="+a+"b="+b);
 }
	public static void main(String[] args) {
		ClassInstance c= new ClassInstance();
		c.get().display();

	}

}