package com.cg.lamexp;

import java.util.LinkedList;

public class CollectionLambdaFunctionalInterface {

	public static void main(String[] args) {
		LinkedList<Integer>l=new LinkedList<>();
		l.add(1);
		l.add(5);
		l.add(7);
		System.out.println(l);
		//Lambda Expression
		l.forEach((i)->{
			System.out.println(l);
		});
	}
}