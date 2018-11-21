package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<>();
		//Map<String,String> map = new LinkedHashMap();
		map.put("myName", "Mike");
		map.put("myJob", "Developer");
		map.put("myAge", "20");
		map.put("x", "y");
		
		map.put("myJob", "Tester");
		
		System.out.println(map);
		
		System.out.println(map.get("myName"));
		System.out.println(map.get("myJob"));
		System.out.println(map.get("myName2"));
		
		Set<String> keys = map.keySet();
		for(String key:keys) {
			System.out.println(key + " " + map.get(key));
		}
		
	}
	
	//Hashmap -fast, unsynchronized, works with single thread,allows one null key
	//HashTable-slow,synchronized,works with multiple thread,does not allow null key
	//LinkedHashMap - preserves the insertion order

}
