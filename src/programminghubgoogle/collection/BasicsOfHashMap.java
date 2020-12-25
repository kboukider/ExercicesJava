package programminghubgoogle.collection;

import java.util.Collections;
import java.util.HashMap;

public class BasicsOfHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "android");
		hm.put(2, "java");
		hm.put(3, "php");
		hm.put(4, "c++");
		hm.put(5, "javascript");
		hm.put(6, "html");
		
		System.out.println(hm + " ");
		System.out.println();
		
		System.out.println("Value at 1 is android : " + hm.containsKey(1) );
		System.out.println("Value at 1 : " + hm.get(1) );
		System.out.println("java is present : "+ hm.containsValue("java"));
		
		//remove
		hm.remove(2);
		hm.remove(6, "html");
		System.out.println("Size after remove operation : " + hm.size());
		
		//replce
		hm.replace(5, "jquery");
		hm.replace(4, "c++", "scala");
		System.out.println("HashMap after replace "+ hm);
		
		hm.clear();
		System.out.println(hm + " Is Map is empty " + hm.isEmpty());
		
	}

}
