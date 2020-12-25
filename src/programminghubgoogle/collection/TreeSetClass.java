package programminghubgoogle.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("java");
		ts.add("php");
		ts.add("android");
		ts.add("css");
		
		System.out.println(ts);
		
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+ "  ");
		}
		System.out.println();
		
		for(String string : ts) {
			System.out.print(string + "  ");
		}
		
	}

}
