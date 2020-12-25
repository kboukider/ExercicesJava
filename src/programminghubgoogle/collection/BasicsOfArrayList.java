package programminghubgoogle.collection;

import java.util.ArrayList;
import java.util.Collections;

public class BasicsOfArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("C");
		al.add("C++");
		al.add("php");
		al.add("python");
		al.add("css");
		
		al.add("html");
		
		al.add(1, "Android");
		System.out.println("ArrayList : "+al);
		System.out.println();
		
		al.remove("php");
		
		System.out.println("Size of ArrayList after removing php : " + al.size());
		System.out.println();
		
		System.out.println("Is ja is in list : "+ al.contains("Java"));
		
		System.out.println("I want "+al.get(0));
		System.out.println();
		
		Object[] a = al.toArray();
		
		System.out.println("Aray : ");
		for (Object object:a) {
			System.out.print(object+ "  ");
		}
		System.out.println();
		
		//change element
		al.set(6, "JavaScript");
		System.out.println("ArrayList after replace : " + al);
		System.out.println();
		
		//sort list using Collections Class
		Collections.sort(al);
		System.out.println("ArrayList sort : "+al);
		System.out.println();
		
		//Index
		System.out.println("Index of android : "+al.indexOf("Android"));
		
		//clear whole list
		al.clear();
		System.out.println(al + " "+ "Is list empty after clear : " + al.isEmpty());
	}

}
