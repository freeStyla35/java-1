package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionClass {

	public static void main(String[] args) {
			
//		int values[] = new int[4];
//		values[0]=0;
//		//values[1]="apple";
//		
//		Object values1[] = new Object[4];
//		values1[0]="apple";
//		values1[1]=1;
		
		Collection values = new ArrayList();
		values.add(10);
		values.add(77);
		values.add("apple");
		values.add(true);
		
		values.remove(77);
		
		Iterator i = values.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		for(Object x : values) {
			System.out.println(x);
		}
		
		
		///////////////////////////////
		
		Collection<Integer> values2 = new ArrayList<Integer>();
		values2.add(3);
		values2.add(5);
		
		//if I want to add something between 10 and apple?
		//no any method available to do this 
		
		//and no sort -  because no index
		
		
	}

}
