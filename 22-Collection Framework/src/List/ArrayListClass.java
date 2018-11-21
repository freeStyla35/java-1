package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(5);
		values.add(10);
		values.add(1,9);
		
		Collections.sort(values);
		
		System.out.println(values);
		
		
		for(int i:values) {
			System.out.println(i);
		}
		
		values.forEach(System.out::println);
		

	}

}
