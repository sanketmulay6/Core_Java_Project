package com.cg.lamexp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparableLambda {

	public static void main(String[] args) {
		Comparator<String>c=(s1,s2)->Integer.compare(s1.length(),s2.length());
		String str[]= {"abc","raj","nial"};
		Collections.sort(Arrays.asList(str),c);
		for(String i:str) {
			System.out.println(i);
							}
	}

}