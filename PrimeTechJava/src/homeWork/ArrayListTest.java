package homeWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class ArrayListTest {

	public static void main(String[] args) {
//		  List<String> list = new ArrayList<String>();
//		    list.add("Dhanbad");
//		    list.add(0, "New York");
//		    list.add("Mumbai");
//		    list.add(2, "Sydney");
//		    System.out.println(list);
		    
		    
//		    
//              int index = 0;
//             Scanner scan = new Scanner(System.in);
	  ArrayList<String> employees = new ArrayList<String>();
	  employees.add("Sara");
	  employees.add("Jason");
	  employees.add("Kevin");
	  employees.add("Tyson");
	  employees.add("Alex");
	  employees.add("Omar");
	  employees.add("Partick");
	  System.out.println(employees);
	  
	  employees.add("Thomas");
	  employees.add(0,"Michael");
	  employees.remove("Omar");
	  employees.add(5 ,"Erin");
	  System.out.println(employees);
	  
	 Iterator <String>it = employees.iterator();
	    while(it.hasNext()){
	      System.out.println(it.next());
	    }
	  
//		     employees[2]="Suzie";
//		     employees[6]="AJ";
//		     employees[1]="Katie";
//		     
//		     for(String employee:employees) {
//		    	 System.out.println(employee);
		  //   }
		   //  System.out.println("enter the Index");
		     
		   //  index = scan.nextInt();
		    // System.out.println(employees[index]);
		     
		        
		           
	}

}
