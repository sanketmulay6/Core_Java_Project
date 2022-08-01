package com.java.string;

import java.util.StringTokenizer;

public class Example5 {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("Hi I am Good");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());

	}

}