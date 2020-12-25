package programminghubgoogle.collection;

import java.util.TreeSet;

public class BasicsOfTreeSet {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(12);
		ts.add(11);
		ts.add(14);
		ts.add(15);
		ts.add(10);
		ts.add(16);
		ts.add(17);

		System.out.println(ts);

		// getting the celling value for 13
		System.out.println("celing value : " + ts.ceiling(13));

		// getting the floor value for 13
		System.out.println("celing value : " + ts.floor(13));
		
		System.out.println("first element : " + ts.first());
		System.out.println("last element : " + ts.last());
		
		System.out.println("poll first element : " + ts.pollFirst());
		System.out.println("poll last element : " + ts.pollLast());
		
		System.out.println("TreeSet after polling : "+ts);
		System.out.println("lower element of 12 : " + ts.lower(12));
		System.out.println("higher element of 12 : "+ts.higher(12));
		System.out.println("higher element of 12 : " + ts.contains(12));
		
		Object[] a = ts.toArray();
		System.out.println("Array : ");
		for(Object object : a) {
			System.out.print(object + "  ");
		}
		System.out.println();
		
		System.out.println("descending Set " + ts.descendingSet());
		System.out.println();
		
		ts.remove(11);
		System.out.println("size of TreeSet after eremoval of 11 : " + ts.size());
		
		ts.clear();
		System.out.println(ts + " " + "Is TreeSet is empty : " + ts.isEmpty());

	}

}
