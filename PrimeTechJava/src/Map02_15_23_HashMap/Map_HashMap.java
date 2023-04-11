package Map02_15_23_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Map_HashMap {

	public static void main(String[] args) {
		HashMap <Integer,String> transferStudents= new HashMap<Integer,String>();
		transferStudents.put(106,"Samuel");
		transferStudents.put(107,"Arshad");
		
		
		HashMap <Integer,String> student= new HashMap<Integer,String>();
		student.put(101 , "Sara");
		student.put(102 , "Mike");
		student.put(103 , "Shav");
		student.put(104 , "Sergey");
		student.put(105 , "Sara");
	    student.putAll(transferStudents);
		
		 System.out.println(student);
		 System.out.println(student.get(101));
			// hash.remove(104); This will remove pair
			// System.out.println(hash);
			 System.out.println(student.containsKey(105));
			 System.out.println(student.containsValue("Sara"));
			 System.out.println(student.containsValue("Afnan"));
			 
			 System.out.println(student.size());
			 System.out.println(student.isEmpty());
			   Set<Integer> key= student.keySet();  // return all the keys as set because duplicate  are not allowed
			   System.out.println(key);
			 System.out.println(student.values());  // return all the values ass Collection because duplicate  are  allowed
			 System.out.println(student.entrySet());
			 System.out.println(student.get(102));
			 System.out.println(student.entrySet());
		 
			 for(Map.Entry entry:student.entrySet()) {
		    	  
		    	  System.out.println(entry.getKey() + "         " + entry.getValue());
		    	  
		      }
		         Set s= student.entrySet();
		        Iterator it = s.iterator();
		         while(it.hasNext()){
		        	Map.Entry entry =(Entry) it.next();
		        	 System.out.println(entry.getKey()+ "  " + entry.getValue());
		         }
			
	}


}
