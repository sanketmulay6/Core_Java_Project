package com.cg.list;

import java.util.ArrayList;

public class CloneArray {

	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {
		ArrayList obj= new ArrayList();
		obj.add(1);
		obj.add("RAJ");
		obj.add(71.40);
		Object clonelist;
		clonelist =obj.clone();
		System.out.println(obj);
		
		
	}

}