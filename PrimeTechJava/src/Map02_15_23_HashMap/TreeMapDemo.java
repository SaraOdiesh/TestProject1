package Map02_15_23_HashMap;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
	TreeMap<Integer,String> students = new TreeMap<Integer,String>();
	students.put(101, "Sara");
	students.put(102, "Mason");
	students.put(103, "Bella");
	
	Set<Entry<Integer,String>> studentEntries= students.entrySet();
	for(Entry<Integer,String>student:studentEntries) {
		System.out.println(student.getKey()+"==>" + student.getKey());
	}
	System.out.println(students);

	}

}
