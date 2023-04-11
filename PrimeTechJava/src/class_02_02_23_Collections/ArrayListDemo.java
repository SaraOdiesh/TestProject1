package class_02_02_23_Collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList <String> names= new ArrayList<String>();
        
        names.add("Sara");
        names.add("Mason");
        names.add("Annabella");
        names.add("Sunny");
     
        names.add(1,"Sammer");
        System.out.println(names);
        //ArrayList<String> friendsArrayList2= 
				//new ArrayList<>(Arrays.asList("Sara","Sammer","Mason","Annabella"));
        //System.out.println(friendsArray2[1]);
	}

}
