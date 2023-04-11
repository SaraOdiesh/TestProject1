package Class_02_08_23_Collection;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;

public class ArrayList_Demo {

	public static void main(String[] args) {
		Student st1 =new Student("Sara", 35, 1);
		Student st2 =new Student("Mason", 8, 2);
		Student st3 =new Student("Bella", 5, 3);
		Student st4 = new Student("Sara",20, 111);
//		
		ArrayList<Student> student= new ArrayList<Student>();
		student.add(st1);
		student.add(st2);
		student.add(st3);
		student.set(1,st4);
		student.get(1).printInfo();;
		int index = student.indexOf(st4);
		System.out.println("Index of st4: " + index);
		
		System.out.println("Size od the ArrayList: " + student.size());
		
		System.out.println("St1 exist: " + student.contains(st1));
		System.out.println("Before Sorting:   " + student);
		//Collections.sort(student.new Comparator<Student>){
		//Collections.sort(student,collection.reverseOrder());
		
		
		
//		Iterator<Student> it = student.iterator();
//		while(it.hasNext()) {
//			 it.next().printInfo();
//	 } 
//		
		
//		for(Student students:student) {
//            students.printInfo();
//		}
//		
//		
//		for(int i=0; i<student.size(); i++) {
//			student.get(i).printInfo();
//		}
//		student.remove(0).printInfo();
//		//System.out.println(student);
//		Student student1 = student.get(1);
//				student1.printInfo();
//		
//		
//		
//		
		
		
		
//		
		ArrayList<String> names = new ArrayList<String>();		names.add("Polat");
		names.add("Shav");
		names.add("Sara");
		names.set(0, "Bijan");
		Collections.sort(names,Collections.reverseOrder());
		System.out.println(names);
		
		
		
			
			
		
		//System.out.println(names.get(0));
		//System.out.println(names.indexOf("Shav"));
//		System.out.println("Shav exist int names: " + names.contains("Shav"));
//		student.clear();
//		System.out.println("After clear the names: " + names);
//		System.out.println("Before Sorting:   " + names);
//		Collections.sort(names); 
//		System.out.println("After Sorting:   " + names);
//		Iterator<String> it = names.iterator();
//		while(it.hasNext()) {
//			 System.out.println(it.next());
//	 } 
//		
//       System.out.println(names);
//        names.remove("Polat");
//        names.remove(0);
//        System.out.println(names);
//        for (String name:names) {
//        	System.out.println(name);
//        }
//        
//        for(int i=0; i<names.size(); i++) {
//        	String elem = names.get(i);
//        	System.out.println(elem);
//        	
   //     }
        
//        
        //str1.hashCode()
        
        //.identityHashCode   
//        ArrayList<Integer> ids =new ArrayList<Integer>();
//        ids.add(123);
//        ids.add(111);
//        ids.add(333);
//        ids.set(2, 543);
//        System.out.println(ids.get(2));
//        System.out.println("Before Sorting:   " + ids);
//		Collections.sort(ids); 
//		System.out.println("After Sorting:   " + ids);
//		Collections.sort(ids,Collections.reverseOrder());
//		System.out.println(ids);
		
       // System.out.println(names.indexOf(111));
       //  Iterator<Integer> it= ids.iterator();
//        boolean hasNext = it.hasNext();
//        System.out.println(hasNext);
//        Integer elem1  = it.hasnext();
//        System.out.println(elem1);
//        System.out.println(it.hasNext());
//        System.out.println(it.next());
////        
         
//         while(it.hasNext()) {
//        	 it.next();
//         }
//        for(Integer id:ids) {
//        	System.out.println(id);
//        }
//        
//        for(int i=0; i<ids.size(); i++) {
//        	
//        	System.out.println(ids.get(i));
//        }
//        Integer data = new Integer(123);
//        ids.remove(data);
//        
        
	}  
        
	}


