package List;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		
		LinkedList<String> object = new LinkedList<String>();
		
		//adding elements to the linkedlist
		object.add("A");
		object.add("B");
		object.addLast("C");
		object.addFirst("D");
		object.add(2, "E");
		object.add("F");
		object.add("G");
		System.out.println("Linked List"+object);
		
		//Removing elements from the linked list
		object.remove("B");
		object.remove(3);
		object.removeFirst();
		object.removeLast();
		System.out.println("Linked List after deletion " + object);
		
		//Finding elements in the linked list
		boolean status = object.contains("E");
		System.out.println(status);
		
		//Number of elements in the linked list
		int size=object.size();
		System.out.println("Size of linked list= " + size);
		
		//Get and Set Elements from Linked List
		Object element = object.get(2);
		System.out.println("Element returned by get() : " + element);
		object.set(2, "Y");
		System.out.println("Linked list after change : " + object);
		
		
		
		
	}

}
