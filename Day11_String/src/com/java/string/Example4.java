package com.java.string;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		String str="Dhoni";
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		if(str.equals(str1)) {
			System.out.println("Matching");
		}
		else {
			System.out.println("Not-Matching");
		}

	}

}