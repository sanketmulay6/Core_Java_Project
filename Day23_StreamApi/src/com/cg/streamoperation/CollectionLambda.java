package com.cg.streamoperation;

import java.util.LinkedList;

public class CollectionLambda {

	public static void main(String[] args) {
		LinkedList<Integer>obj = new LinkedList<>();
		obj.add(12);
		obj.add(13);
		System.out.println(obj);
	obj.forEach(System.out::println);

	}

}