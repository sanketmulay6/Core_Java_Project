package com.cg.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Object> q= new ArrayDeque<Object>();
		q.add(1);
		q.add(28);
		q.add(14);
		q.add(19);
		System.out.println(q);
		System.out.println(q.peek());
		
		Queue<Object> q1= new PriorityQueue<Object>();
		q1.add(99);
		q1.add(8);
		q1.add(19);
		q1.add(2);
		System.out.println(q1);
		System.out.println(q1.peek());
	}

}