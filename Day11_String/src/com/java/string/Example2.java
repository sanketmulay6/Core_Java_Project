package com.java.string;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your keyword:");
		String str=s.nextLine();
		System.out.println("keyword is:"+str);
		s.close();
	}

}