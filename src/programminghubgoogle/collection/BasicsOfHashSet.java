package programminghubgoogle.collection;

import java.util.Collections;
import java.util.HashSet;

public class BasicsOfHashSet {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Java");
		hs.add("Android");
		hs.add("Php");
		hs.add("Ajax");
		
		System.out.println(hs);
		
		hs.add("Python");
		System.out.println(hs);
		
		//Can't add dplicate
		System.out.println("Is java added : "+ hs.add("Java"));
		
		// remove from HashSet
		hs.remove("Php");
		
		//Size of HashSet
		System.out.println("Size of ArrayList after removing Php : " + hs.size());
		System.out.println();
		
		System.out.println("Is java is in list : " + hs.contains("Java"));
		
		System.out.println();
		//HashSet to Array
		Object [] a = hs.toArray();
		System.out.println("Array : ");
		for(Object object : a) {
			System.out.print(object + "  ");
		}
		
		System.out.println();
		
		
		
		hs.clear();
		System.out.println(hs + " Is HashSet empty after clear : "+hs.isEmpty());
  	}

}
