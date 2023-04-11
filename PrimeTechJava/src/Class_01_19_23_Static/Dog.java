package Class_01_19_23_Static;

public class Dog {
       // Static Variable 
	  static String breed;
	  static String color;
	  
	 
	  
	  
	  // Instance Variable 
		  String name;
		  String size;
		  int age;
		  
		  
		  public Dog(String name, String size, int age) {
			  this.name = name;
			  this.size = size;
			  this.age = age;
			  
		  }
		  
	
		  
		  public void printDogInfo() {
			  System.out.println("**********Dog Info***********");
			  
			  System.out.println("Name: " +this.name);
			  System.out.println("Size: " + this.size);
			  System.out.println("age: " + this.age);
			  System.out.println("Breed: " + breed);
			  System.out.println("Color: " + color);
			  System.out.println("***************************");
		  }



  public static void bark () {
	  System.out.println("Woof Woof!");
  }
  

public static void eat () {
	System.out.println("Dog is eating ");
}



			
	  }	
		  
		  



