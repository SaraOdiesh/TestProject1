package Class_01_18_23_Constructor;

public class Person {
	
	String name;
	int age;
	
       
       // no arg constructor    
	public Person() {
		System.out.println("No arg constructor");
		this.name = "Robot";
		this.age = 4;
		
		}
          
          public Person(String name) {
        	this.name = name; 
        	  
        	  
          }
        
          public Person (int age ) {
        	  this.age = age;
          }
          
          public Person (String name, int age) {
        	this.name = name;
        	this.age = age;
          }
          
	}

