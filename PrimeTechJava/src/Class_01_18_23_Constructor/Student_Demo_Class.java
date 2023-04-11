package Class_01_18_23_Constructor;

public class Student_Demo_Class {

	public static void main(String[] args) {
		
	
		Student st1 = new Student();
		
		st1.printStudentInfo();
		
		Student st2 = new Student("Mason", "Odiesh", 7, false);
		
		st2.printStudentInfo();
		
		Student st3 = new Student ("Anna", "Odiesh", 5, true);
		st3.printStudentInfo();
		
		

	}

}
