package Class_02_06_23_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortingHashSet {

	public static void main(String[] args) {
	Set<Integer>numbers	=new HashSet<Integer>();
	
	numbers.add(5);
	numbers.add(1);
	numbers.add(2);
	numbers.add(7);
	numbers.add(8);
	numbers.add(3);
	numbers.add(4);
    System.out.println(numbers);
    
    List<Integer> numberList= new ArrayList<Integer>(numbers);
    Collections.sort(numberList);
    System.out.println("ASC Order: " + numberList);
    Collections.sort(numberList,Collections.reverseOrder());
    System.out.println("DESC Order: " + numberList);
    
    
	}

}
