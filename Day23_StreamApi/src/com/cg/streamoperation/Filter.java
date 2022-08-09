package com.cg.streamoperation;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
	List<Float> obj= Arrays.asList(12.5f, 13.5f,15.5f);
	obj.stream().filter(i->i>10.5f).forEach(System.out::println);

	}

}