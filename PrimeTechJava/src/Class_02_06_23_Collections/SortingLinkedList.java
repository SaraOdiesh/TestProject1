package Class_02_06_23_Collections;

import java.util.Collections;
import java.util.LinkedList;

public class SortingLinkedList {

	public static void main(String[] args) {
		LinkedList<Double> salary =new LinkedList<Double>();
		
		salary.add(100000.0);
		salary.add(150000.0);
		salary.add(200000.0);
		salary.add(95000.0);
		
		System.out.println("Befor Sorting in ASC order: " + salary);
		Collections.sort(salary);
		System.out.println("After Sorting in ASC order: " + salary);
		Collections.sort(salary,Collections.reverseOrder());
		System.out.println(salary);
	}

}
