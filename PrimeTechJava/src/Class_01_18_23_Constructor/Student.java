package Class_01_18_23_Constructor;

public class Student {
	public static String batchNumber = "Batch4";
	/*
	 *   Instance variable of Student class
	 *   object these variables belongs to 
	 *   the object of the  class 
	 *   
	 */
      String firstName;
      String lastName;
      int age;
      boolean isActive;
      
      // No- arg Constructor 
      public Student() {
    	  this.firstName = "Hudson";
    	  this.lastName = "James";
    	  this.age = 50;
    	  this.isActive = true;
    	  
      }
      
      
      public Student(String firstName,String lastName,int age, boolean isAcative) {
    	//  System.out.println("************Parameterized constructor*************");
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.age = age;
    	this.isActive = isActive;
    	
    	 
    	  
      }
      public Student (String firstName, String lastName) {
    	  this.firstName = firstName;
    	  this.lastName = lastName; 
    	  
    		  
      }
      
      
        public void printStudentInfo() {
        	System.out.println("****************** Student Information ******************");
        	System.out.println("First Name: " + this.firstName);
        	System.out.println("Last Name: " + this.lastName);
        	System.out.println("age: " + this.age);
        	System.out.println("Is active: " + this.isActive);
        	System.out.println("Batch number: " + batchNumber);
            System.out.println("***********************End************************************");
        }
      /*
       * This method will initialize the instance
       * Variable
       * 
       */
       public void initializeStudent(String firstName, String lastName,int age,boolean isActive) {
    	   this.firstName = firstName;
    	   this.lastName = lastName;
    	   this.age = age;
    	   this.isActive = isActive;
    	   
    			    }
       /* Get Student name: Will return the full name of the student 
        * 
        */
       
       public String getStudentName () {
    	   String fullName = this.firstName + " " + this.lastName;
    	   return fullName;
    	   
    	   
       }
       
       /*
        * Get age method will return the age of the student
        * 
        */
       
       public int getAge() {
    	  return this.age;
    	  
       }
       
       
       /* 
        * Get active status will return the status of the student object
        * 
        * 
        */
       
       
       public boolean getActiveStatus() {
    	   
    	   return this.isActive;
       }
       
       /*
        * Attending Class will print appropriate message based on the 
        * student active status
        */
       
       public void attendingClass() {
    	   String fullName = getStudentName();
    	   
    	   if (this.isActive) {
    		   System.out.println(fullName + " is attending the class");
    	   }
    	   else {
    		   System.out.println(fullName + " student status is not active, please "
    		   		+ "enroll to the class");
    	   }
       }
    	   
    	   /*
    	    * deactivateStudent will change  the status of the student to inactive
    	    * 
    	    * 
    	    */
    	   
    	   public void deactivateStudent() {
    		   if (this.isActive) {
    			   isActive = false;
    			   
    		   }
    		   System.out.println(getStudentName() + " status is deactivated , please see admin!");
    	   }
       
       
       /*
        * EnrollClass method will enroll the student to the class and 
        * make them active. 
        */
       
    	   public void enrollClass() {
    		   if(!this.isActive) {
    			   isActive = true;
    			   
    		   }   System.out.println( "You have enrolled to our class,"
    		   		+ "you status is active ");
    			   
    	   }
       
       
       
       
       
       
}
