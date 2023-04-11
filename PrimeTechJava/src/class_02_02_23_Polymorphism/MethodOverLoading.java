package class_02_02_23_Polymorphism;

public class MethodOverLoading {
     public static void display(int a) {
    	 
    	 System.out.println("Displaying integer Data: " + a);
     }
     
     public static void display(String a) {
    	 
    	 System.out.println("Displaying integer object: " + a);
     }
     
     public static void main(String[] args) {
    	 MethodOverLoading.display(123);
    	 MethodOverLoading.display("Hello");
     }
}
