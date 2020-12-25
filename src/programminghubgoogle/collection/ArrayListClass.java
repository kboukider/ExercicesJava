package programminghubgoogle.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {
			
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("C");
		al.add("C++");
		al.add("php");
		
		System.out.println("ArrayList : " + al);
		System.out.println();
		
		//getting Iterator from arrayList to traverse elements
		Iterator itr = al.iterator();
		
		while (itr.hasNext()) {
			System.out.print(itr.next()+ "  ");
			
		}
		
		System.out.println();
		
		
		for (String string : al) {
			System.out.print(string + "  ");
		}
	}

}
