package Class_02_08_23_Collection;

public class Student {
	
	private int age;
	private String name;
	private int id;
	
	
	public Student(String name, int age,int id) {
		
		this.name = name;
		this.age = age;
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public String getName() {
		return name;
	}


	public int getId() {
		return id;
	}
	
	public void printInfo() {
		System.out.println("************************");
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Id: " + this.id);
		System.out.println("************************");
		
		
	}
	

}
