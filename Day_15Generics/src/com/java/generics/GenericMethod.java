package com.java.generics;

public class GenericMethod {

	public static void main(String[] args) {
		
		Integer arr[]= {1,2,3,4};
		Character ch[]= {'A','V','D'};
		System.out.println("Integer Array");
		print(arr);
		System.out.println("Character String");
		print(ch);

	}
	public static<E> void print(E[] element) {
		for(E elem:element) {
			System.out.println(elem);
		}
		System.out.println();
	}

}