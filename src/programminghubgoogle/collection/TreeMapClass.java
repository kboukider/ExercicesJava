package programminghubgoogle.collection;

import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
		hm.put(100, "java");
		hm.put(102, "android");
		hm.put(101, "php");
		hm.put(103, "c++");
		hm.put(104, "html");
		
		System.out.println(hm);
		
		TreeMap<String, Integer> hm2 = new TreeMap<String, Integer>();
		hm2.put("java",100);
		hm2.put("android",102);
		hm2.put("php",101);
		hm2.put("c++",103);
		hm2.put("html",104);
		
		System.out.println(hm2);
		
		
	}

}
