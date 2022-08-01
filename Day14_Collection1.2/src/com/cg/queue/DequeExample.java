package com.cg.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
		Deque<Object> d= new ArrayDeque<Object>();
		d.add(11);
		d.addFirst(2);
		d.addLast(30);
		System.out.print(d);

	}

}