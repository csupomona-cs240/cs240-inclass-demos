package edu.cpp.cs240.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		//Queue<Integer> waitingList = new LinkedList<Integer>();
		Queue<Integer> waitingList = new PriorityQueue<Integer>();
		waitingList.add(32);
		waitingList.add(12);
		waitingList.add(45);
		waitingList.add(67);
		System.out.println(waitingList);
		System.out.println(waitingList.poll());
		System.out.println(waitingList.poll());
		System.out.println(waitingList.poll());
		System.out.println(waitingList);
	}

}
