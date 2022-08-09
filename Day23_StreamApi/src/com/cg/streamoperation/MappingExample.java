package com.cg.streamoperation;

import java.util.Arrays;
import java.util.List;

public class MappingExample {

	public static void main(String[] args) {
		List<String>obj=Arrays.asList(new String[] {"apple","lichi","orange"});
		System.out.println("word length for fruit");
		obj.stream().map(String::length).forEach(i->System.out.println(i+" "));
		

	}

}