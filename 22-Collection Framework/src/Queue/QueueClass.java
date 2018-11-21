package Queue;

import java.util.*;


public class QueueClass {

	public static void main(String[] args) {
		
		//Queue<Integer> q = new PriorityQueue<Integer>();
		Queue<Integer> q = new LinkedList<Integer>();
		
		//Add elements
		for(int i=0;i<5;i++) {
			q.add(i);
		}
		
		//Display contents of the queue
		System.out.println("Elements of queue " + q);
		
		//To remove the head of queue
		int removedele = q.remove();
		System.out.println("removed element-" + removedele);
		
		System.out.println(q);
		
		//To view the head of queue
		int head=q.peek();
		System.out.println("head of queue-" + head);
		
		int size=q.size();
		System.out.println(size);
	}

}
