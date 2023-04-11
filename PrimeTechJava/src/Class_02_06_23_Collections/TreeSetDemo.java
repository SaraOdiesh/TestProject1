package Class_02_06_23_Collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<String> countries= new TreeSet<String>();
		countries.add("USA");
		countries.add("Canda");
		countries.add("Iraq");
		countries.add("Uzbekistan");
		countries.add("Sudan");
		
		
		System.out.println(countries);
	}

}
