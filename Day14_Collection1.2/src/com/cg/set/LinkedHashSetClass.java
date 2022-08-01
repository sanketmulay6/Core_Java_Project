package com.cg.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		Set <Object> s= new LinkedHashSet<Object>();
		s.add(1);
		s.add("Math");
		s.add(60.50f);
		System.out.println(s);
		Object [] a=s.toArray();
		for(int i=0;i<a.length;i++);
		{	int i=0;
			System.out.print(a[i]);
		}
		
	}

}