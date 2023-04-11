package homeWork;

import java.util.Arrays;

class SDETCourse extends PrimeTech{

	
	String startDate;
	String endDate;
	String classType;
	String []topics;
	
	   public SDETCourse(String schoolName, String[] instructors,
			   String address, String phoneNumber, String startDate,
			   String endDate, String classType, String[] topics) {
		   super();
	        this.startDate = startDate;
	        this.endDate = endDate;
	        this.classType = classType;
	        this.topics = topics;
	}
		
		public void printCourseInfo() {
			System.out.println("School Name: " + schoolName);
	        System.out.println("Instructors: " + Arrays.toString(instructors));
	        System.out.println("Address: " + address);
	        System.out.println("Phone Number: " + phoneNumber);
	        System.out.println("Start Date: " + startDate);
	        System.out.println("End Date: " + endDate);
	        System.out.println("Class Type: " + classType);
	        System.out.println("Topics: " + Arrays.toString(topics));
			
			
			
			
		}
		
		
		
		
	}
	


