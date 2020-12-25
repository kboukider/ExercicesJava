package programminghubgoogle.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapClass {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "android");
		hm.put(2, "java");
		hm.put(3, "php");
		hm.put(4, "c++");
		hm.put(5, "javascript");

		System.out.println(hm + " ");
		System.out.println();

		Iterator iterator = hm.entrySet().iterator();

		while (iterator.hasNext()) {

			Map.Entry mapEntry = (Map.Entry) iterator.next();
			System.out.println("The key is : " + mapEntry.getKey() + " ,value is : " + mapEntry.getValue());
		}
		System.out.println();

		for (Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
		
		System.out.println();

		for (Object key : hm.keySet()) {
			System.out.println("Key " + key.toString() + " Value : " + hm.get(key));
		}
	}
}
