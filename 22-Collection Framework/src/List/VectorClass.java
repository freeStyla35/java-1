package List;

import java.util.List;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		
		//Vector has an initial size of 10: and the increase the capacity %100
		//vector is slow-  not  good to use
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(4);
		v.add(5);
		v.add(6);
		v.add(7);
		v.add(8);
		v.add(9);
		v.add(10);
		v.add(11);
		v.add(12);
		v.add(13);
		
		v.add(4);
		v.add(5);
		v.add(6);
		v.add(7);
		v.add(8);
		v.add(9);
		v.add(10);
		v.add(11);
		v.add(12);
		v.add(13);
		
		v.add(4);
		v.add(5);
		v.add(6);
		v.add(7);
		v.add(8);
		v.add(9);
		v.add(10);
		v.add(11);
		v.add(12);
		v.add(13);
		
		v.remove(1);
	
		
		System.out.println(v.capacity());
		
		for(int i:v) {
			System.out.println(i);
		}
		
		
		
	}

}
