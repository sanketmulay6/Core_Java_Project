package com.cg.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List l= new LinkedList();
		l.add(1);
		l.add("Sourabh");
		l.add("Math");
		l.add(59.88f);
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.indexOf("Math"));
		System.out.println(l.contains(59.88f));
		System.out.println(l.lastIndexOf("Math"));
	}

}