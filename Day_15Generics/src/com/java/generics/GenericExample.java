package com.java.generics;

import java.util.LinkedList;
import java.util.List;

public class GenericExample {

	public static void main(String[] args) {
		List<Integer> l=new LinkedList<Integer>();
		l.add(11);
		l.add(12);
		//1.compile time and 2.type safe
		System.out.println(l);
		//3.Type cast is not required in Generic
		List<String> l1=new LinkedList<String>();
		l1.add("Raj");
		l1.add("Aniket");
		System.out.println(l1);
		System.out.println(l1.get(1));
		

	}

}