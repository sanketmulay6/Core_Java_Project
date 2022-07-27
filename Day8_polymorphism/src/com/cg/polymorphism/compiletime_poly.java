package com.cg.polymorphism;
//changing number of arguments.
class Shape{
	int area(int a) {
		return a*a;
	}
	int area(int a,int b) {
		return a*b;
	}
}
public class compiletime_poly {

	public static void main(String[] args) {
		Shape s= new Shape();
		System.out.println(s.area(5));
		System.out.println(s.area(4, 8));
	}

}