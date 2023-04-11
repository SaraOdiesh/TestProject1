package homeWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HashSet_HomeWork {

	public static void main(String[] args) {
		/* HomeWork2: HashSet
	     * ==> Create HashSet of Integer
	     * ==> Add 5 random Integer
	     * ==> remove element on index 0 and 1
	     * ==> sort the elements in ascending orders
	     * ==> sort the element in desending order
	     * ==> use iterator to loop through the HashSet
	     * ==> use for loop to loop through the HashSet
	     * ==> use for each loop to loop through the HashSet
	     * ==> Convert the HashSet to LinkedList
	     * ==> convert the HashSet to Array
	     */
	     System.out.println("******************************************************");
	     HashSet<Integer> numbers = new HashSet<Integer>();
	     numbers.add(55);
	     numbers.add(66);
	     numbers.add(77);
	     numbers.add(88);
	     numbers.add(99);
	     System.out.println(numbers);
	     // HashSet does not have a specific index and elements 
	    // are not stored in any particular order. 
	    // So, removing elements based on index is not possible
	     System.out.println("After removing the first two elements: " + numbers);
	     // Sorting number in HashSet is not possible.
	    Iterator it = numbers.iterator();
	      while (it.hasNext()) {
	        System.out.println(it.next());
	}
	    System.out.println(" Using for each loop to loop through the HashSet");
	    for (Integer i:numbers){
	      System.out.println(i);
	    }

	   
	     List<Integer> list = new LinkedList<Integer>(numbers);
	     System.out.println("After Converting the HashSet to LinkedList:  " + list);
	    
	     Integer [] arr = numbers.toArray(new Integer[numbers.size()]);
	      System.out.println("After Converting the HashSet to Array: ");

	    for(int i:arr){
	      System.out.println(i);
	    }
	     

	}

}
