package com.cg.regex;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		String pattern ="Hello Gi";
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		boolean result= pattern.matches(input);
		System.out.println(result);
		s.close();
	}

}