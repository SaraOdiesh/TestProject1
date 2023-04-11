package Class_02_06_23_Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		
		
		ArrayList<String> list= new ArrayList<String>();
		list.add("Ernesto");
		list.add("Faris");
		LinkedList <String> names= new LinkedList<String>();
        names.add("Irada");
        names.add("Sara");
        names.add("Sergey");
        System.out.println(names);
        String elem= names.remove();
        System.out.println(elem);
		names.addAll(list);
		System.out.println(names);
		names.addAll(0, list);
		System.out.println(names);
		names.addFirst("Polat");
		System.out.println(names);
		names.addLast("Helil");
		System.out.println(names);
		//Object obj= names.clone();
		 //LinkedList<String>()obj;
//		System.out.println(names.getFirst());
//		System.out.println(names.getLast());
//		System.out.println(names.indexOf("Ernesto"));
//		System.out.println(names.lastIndexOf("Ernesto"));
//		
//		System.out.println(names.poll());
//		System.out.println(names);
//		System.out.println(names.pollFirst());
//		System.out.println(names.pollLast());
//		System.out.println(names);
//		System.out.println(names.removeFirst());
//		System.out.println(names.removeLast());
//		System.out.println(names.removeFirst());
//		System.out.println(names.removeLast());
		
		System.out.println(names.removeFirstOccurrence("Ernesto"));
		System.out.println(names.removeLastOccurrence("Ernesto"));
		System.out.println(names);
		names.set(2, "Sara");
		
		
		for(int i=0; i<names.size();i++) {
			
			System.out.println(names.get(i));
		}
	}

}
