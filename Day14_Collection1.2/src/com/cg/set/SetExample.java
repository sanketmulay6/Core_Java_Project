package com.cg.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<Object> s= new HashSet<Object>();
		s.add(1);
		s.add("Sourabh");
		s.add("Pass");
		s.add(60.75f);
		System.out.println(s);

	}

}