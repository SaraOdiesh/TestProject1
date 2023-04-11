package Map02_15_23_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateMap {

	

	public static void main(String[] args) {
		Map<Integer,String> students= new HashMap<Integer,String>();
		students.put(111, "Dilara");
		students.put(112, "Sara");		
		students.put(113, "Irada");
		students.put(114, "Sudaif");
		
		 Set <Entry<Integer,String>> studentEntries= students.entrySet();
		
		 
	      for(Entry<Integer, String>entry:studentEntries) {
	    	  
	    	  System.out.println(entry.getKey() + "         " + entry.getValue());
	    	  
	    	  System.out.println(studentEntries);
	      }
	      
	      Set <Entry<Integer,String>>s= students.entrySet();
	        Iterator  <Entry<Integer,String>>it = s.iterator();
	         while(it.hasNext()){
	        	Map.Entry entry =(Entry) it.next();
	        	 System.out.println(entry.getKey()+ ":" + entry.getValue());
	}

	}
}
