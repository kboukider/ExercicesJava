package programminghubgoogle.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortAMapByValue {

	public static void main(String[] args) {
		Map<String, Integer> map= new HashMap<String, Integer>();
		map.put("VB.net", 20);
		map.put("Java", 55);
		map.put("Python", 7);
		map.put("C++", 68);
		map.put("Jvascript", 26);
		map.put("C", 86);
		
		Set<Entry<String, Integer>> set = map.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(set);
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer>o1, Map.Entry<String, Integer>o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});
		
		System.out.println("In Descending Order : ");
		for(Map.Entry<String, Integer> entry : list) {
			System.out.print(entry.getValue() + ")  " + entry.getKey());
		}	
	}
}
