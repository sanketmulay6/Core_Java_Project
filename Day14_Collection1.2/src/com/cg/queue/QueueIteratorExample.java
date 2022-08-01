package com.cg.queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class QueueIteratorExample {

	public static void main(String[] args) {
		Queue<Object> q= new ArrayDeque<Object>();
		for(int i=0;i<5;i++) {
			q.add(i);
		}
		System.out.println(q);
		boolean isadded =q.offer(25);
		System.out.println("Is Added:" +isadded);
		System.out.println(q);
		//Iterator is used to return single separately
		Iterator<Object> itr=q.iterator();
		System.out.println("the elements are:");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}