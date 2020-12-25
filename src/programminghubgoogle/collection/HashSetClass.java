package programminghubgoogle.collection;

import java.util.HashSet;
import java.util.Iterator;



public class HashSetClass {

	public static void main(String[] args) {
		
		HashSet<String> al = new HashSet<String>();
		al.add("Java");
		al.add("Android");
		al.add("Php");
		al.add("Ajax");
		
		System.out.println(al);
		
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "  ");
		}
		System.out.println();
		
		for (String string : al) {
			System.out.print(string + "  ");
		}
		
	}

}
