package Map02_15_23_HashMap;

import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> students = new LinkedHashMap<Integer,String>();
		students.put(101, "Sara");
		students.put(102, "Mason");
		students.put(103, "Bella");
		
		Set<Entry<Integer,String>> studentEntries= students.entrySet();
		for(Entry<Integer,String>student:studentEntries) {
			System.out.println(student.getKey()+"==>" + student.getValue());
		}
		System.out.println(students);

		Iterator<Entry<Integer,String>> it = students.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			System.out.println("Key: " + entry.getKey() + ", Value" +entry.getValue());
			
		}
		}

	}


