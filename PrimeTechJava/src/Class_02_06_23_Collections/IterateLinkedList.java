package Class_02_06_23_Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateLinkedList {

	public static void main(String[] args) {
LinkedList <String>l = new LinkedList<String>();
		
		
		l.add("Dog");
		l.add("Cat");
		l.add("Horse");
		System.out.println("Using for loop: ");
		for(int i=0; i<l.size();i++) {
			System.out.println(l.get(i));
		}
			System.out.println("Using for each loop: ");
			for(Object e:l) {
				System.out.println(e);
				
			}
			
			System.out.println("Using Iterator: ");
				Iterator it= l.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
					
					
					
				}
				

	}

}
