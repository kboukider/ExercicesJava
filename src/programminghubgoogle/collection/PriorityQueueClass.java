package programminghubgoogle.collection;

import java.util.Iterator;
import java.util.PriorityQueue;


public class PriorityQueueClass {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("java");
		queue.add("android");
		queue.add("php");
		queue.add("c++");
		queue.add("css");
		queue.add("javascript");
		queue.add("python");
		queue.add("ajax");
		
		queue.offer("jquery");
		
		Iterator itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+ "  ");			
		}
		System.out.println();
		
		System.out.println("head : "+queue.element());
		System.out.println("head : "+queue.peek());
		
		queue.remove();
		
		queue.poll();
		queue.remove("css");
		
		System.out.println("Queue After remove and poll operation : " + queue);
		System.out.println("Is python is present : " + queue.contains("python"));
		
		Object a[] = queue.toArray();
		for(Object object : a) {
			System.out.print(object + "  ");
		}
		System.out.println();
		
		queue.clear();
		System.out.println(queue + " queue size : " + queue.size());
		
		
		
	}

}
