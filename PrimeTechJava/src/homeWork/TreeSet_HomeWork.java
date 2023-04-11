package homeWork;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_HomeWork {

	public static void main(String[] args) {
		/*
	     * HomeWork3: TreeSet
	     * ==> Create TreeSet of String
	     * ==> Add 5 random Strings
	     * ==> remove element on index 0 and 1
	     * ==> sort the elements in ascending orders
	     * ==> sort the element in desending order
	     * ==> use iterator to loop through the TreeSet
	     * ==> use for loop to loop through the TreeSet
	     * ==> use for each loop to loop through the TreeSet
	     * ==> Convert the ArrayList to ArrayList
	     * ==> convert the ArrayList to Array
	     */
	     Set <String> food = new TreeSet<String>();
	     food.add("Salad");
	     food.add("Steak");
	     food.add("Fish");
	     food.add("Chicken");
	     food.add("Pizza");
	     System.out.println(food);

	    food.remove("Salad");
	    food.remove("Steak");
	    System.out.println("After removing element on index 0 and 1");
	    System.out.println("Using iterator to loop through the TreeSet");
	    Iterator it = food.iterator();
	    while(it.hasNext()){
	      System.out.println(it.next());
	    }
	    System.out.println(" Using for each loop to loop through the TreeSet");
	    for(String foodi: food){
	      System.out.println(foodi);
	    }
	    

	}

}
