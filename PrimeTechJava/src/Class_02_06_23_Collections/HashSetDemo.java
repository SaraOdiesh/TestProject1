package Class_02_06_23_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<String>();
		names.add("Harry");
		names.add("David");
		names.add("Jack");
		names.add("Harry");
		names.add("Faris");
		names.add("Faris");
		System.out.println(names);
		
//		for(String name:names) {
//			//if(names.equals("Jack")) {
//			System.out.println(name);
//		}
//		
		//Converting hashSet to Array
		String[] namesArr = names.toArray(new String [names.size()]);
		System.out.println("*******************");
		System.out.println(namesArr[0]);
		System.out.println(namesArr[1]);
		System.out.println(namesArr[2]);
		System.out.println(namesArr[3]);
		
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
			ArrayList<String> namesList = new ArrayList<>(names);
			System.out.println(namesList);
			System.out.println(namesList.get(0));
			System.out.println(namesList.get(1));
			System.out.println(namesList.get(2));
		}
	}
		
	
}
