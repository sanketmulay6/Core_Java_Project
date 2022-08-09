package com.cg.lamexp;
interface C{
	int add(int a, int b);
}


public class LambdaExpression {

	public static void main(String[] args) {
C c=(int a, int b)->(a*b);
System.out.println("multiplication of a and b: "+c.add(7, 9));

	}

}