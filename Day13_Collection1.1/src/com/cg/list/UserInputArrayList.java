package com.cg.list;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInputArrayList {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	String str= s.nextLine();
	System.out.println(str);
	Scanner token = new Scanner(str);
	token.delimiter();
	ArrayList<Object> arr= new ArrayList<Object>();
	while(token.hasNext()) {
		arr.add(token.hasNext());
		System.out.println(arr.get(arr.size()-1));
	}
	//System.out.println(arr);
	}

}