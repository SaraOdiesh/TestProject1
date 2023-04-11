package homeWork;

import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
	
	   String[] instructors = {"John", "Jane", "Jim"};
	   String[] topics = {"Java", "Selenium", "Automation Testing"};
	        
		   SDETCourse sdet = new SDETCourse("PrimeTech", new String[]{"Ajay", "Polat", "Helil"},
				   "123 Main St.", "703-222-3232", "10/24/2023", "04/15/2023",
				   "Remote", new String[]{"Java", "Selenium", "Agile"});

		  
	       
	        System.out.println("School Name: " + sdet.schoolName);
	        System.out.println("Instructors: " + Arrays.toString(sdet.instructors));
	        System.out.println("Address: " + sdet.address);
            System.out.println("Phone Number: " + sdet.phoneNumber);
	        System.out.println("Start Date: " + sdet.startDate);
	        System.out.println("End Date: " + sdet.endDate);
	        System.out.println("Class Type: " + sdet.classType);
	        System.out.println("Topics: " + Arrays.toString(sdet.topics));
	        sdet.printCourseInfo();
	        
	        
	        PrimeTech parent = sdet;
	        //System.out.println("\nMembers accessible from parent reference: ");
	        System.out.println("School Name: " +parent.schoolName);
	        System.out.println("Instructors: " + Arrays.toString(parent.instructors));
	        System.out.println("Address: "+ parent.address);
	        System.out.println("Phone Number: "+ parent.phoneNumber);
	}

}
