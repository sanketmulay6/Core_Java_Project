package com.cg.vector;

import java.util.ArrayList;
import java.util.Vector;

public class VectorProgram {

	public static void main(String[] args) {
		Vector<Object> v= new Vector<Object>();
		v.add(0,"A");
		v.add(1,"B");
		v.add(2,"C");
		v.add(3,"D");
		System.out.print(v);
		System.out.println(v.set(0,"Hello"));
		
		
		ArrayList<Object> a= new ArrayList<Object>();
		a.addAll(v);
		System.out.print(a);
		a.clear();
		//System.out.println(a);

	}

}