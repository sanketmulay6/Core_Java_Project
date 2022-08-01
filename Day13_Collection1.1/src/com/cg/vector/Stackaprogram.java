package com.cg.vector;

import java.util.Stack;

public class Stackaprogram {

	public static void main(String[] args) {
		Stack<Object> s= new Stack<Object>();
		s.push(12);
		s.push(89.05f);
		s.push("ABCD");
		System.out.print(s);
		s.pop();
		System.out.print(s);

	}

}