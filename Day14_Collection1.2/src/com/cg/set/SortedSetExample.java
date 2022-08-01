package com.cg.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
		SortedSet<Object> s= new TreeSet<Object>();
		s.add("hello");
		s.add("hell");
		s.add("he");
		System.out.print(s);
		

	}

}