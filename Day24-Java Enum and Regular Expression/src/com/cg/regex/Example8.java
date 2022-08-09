package com.cg.regex;

import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		@SuppressWarnings({ "unused", "resource" })
		Scanner s= new Scanner(System.in);
		String str="m21\r\nhiii\r\n";
		String[] res=str.split("\\r\\n");
		for (String i:res) {
			System.out.println(i);
		}
	}

}