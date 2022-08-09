package com.cg.streamoperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStream {

	public static void main(String[] args) {
		Stream<String> obj= Stream.of("Raj");
		obj.forEach((i)->System.out.println(i));
		List<String> obj1=Arrays.asList(new String[] {"mumbai","pune"});
		obj=obj1.stream();
		obj.forEach(System.out::println);
	}
}