package com.java.string;

import java.util.Scanner;

public class Lenght {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		s.close();
	}

}