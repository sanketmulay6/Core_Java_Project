package com.cg.streamoperation;

import java.util.Arrays;
import java.util.List;

public class StreamOperation {

	public static void main(String[] args) {
	List<Integer>obj=Arrays.asList(1,2,3,4,5,6,7);
	//distinct : it takes unique values
	obj.stream().distinct().forEach(i->System.out.print(i+" "));
	System.out.println();
	//Limit: sets the Limit
	obj.stream().limit(5).forEach(i->System.out.print(i+" "));

	}

}