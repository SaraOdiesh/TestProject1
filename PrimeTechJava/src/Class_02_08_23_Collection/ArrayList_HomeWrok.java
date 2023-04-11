package Class_02_08_23_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayList_HomeWrok {

	public static void main(String[] args) {
		/*
	     * HomeWork1: ArrayList
	     * ==> Create ArrayList of String
	     * ==> Add 5 random Strings
	     * ==> remove element on index 0 and 1
	     * ==> sort the elements in ascending orders
	     * ==> sort the element in DESC order
	     * ==> use iterator to loop through the ArrayList
	     * ==> use for loop to loop through the ArrayList
	     * ==> use for each loop to loop through the ArrayList
	     * ==> Convert the ArrayList to HashSet
	     * ==> convert the ArrayList to Array
	     */

	    ArrayList<String> actors = new ArrayList<String>();
	    actors.add("Walter");
	    actors.add("Jesse");
	    actors.add("Skyler");
	    actors.add("Hank");
	    actors.add("Gus");

	    System.out.println("Before removing the first two elements: " + actors);
	    
	    actors.remove(0);
	    actors.remove(1);
	    System.out.println("After removing the first two elements: " + actors);
	    Collections.sort(actors);
	    Collections.sort(actors,Collections.reverseOrder());
	    System.out.println("After sorting the elements in desending order: " + actors);
	    System.out.println("Using iterator to loop through the ArrayList");
	    Iterator it = actors.iterator();
	    while(it.hasNext()){
	       System.out.println(it.next());
	     }
	    System.out.println("Using for loop to loop through the ArrayList");
	    for(int i=0; i<actors.size();i++){
	      System.out.println(actors.get(i));
	    }
	    System.out.println("use for each loop to loop through the ArrayList");
	     for(Object person:actors){
	       System.out.println(person);
	       
	     }

	    HashSet<String> setPerson = new HashSet<String>(actors);
	   
	    System.out.println("Convert the ArrayList to HashSet: " + setPerson);

	     String [] array = actors.toArray(new String[actors.size()]);
	     System.out.println("After converting the ArrayList to Array: " );

	     for(String a:array){
	       System.out.println(a + "");
	     }
	    

	}

}
