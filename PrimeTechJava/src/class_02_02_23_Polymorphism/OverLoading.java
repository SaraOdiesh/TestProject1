package class_02_02_23_Polymorphism;

public class OverLoading {
 
	
	 public int multiplay(int a,int b) {
		 return a * b;
	 }
	 
	 public double multiplay(double a,double b) {
		 return a * b;
	 }
	 public int multiplay(int a,int b, int c) {
		 return a * b * c;
	 }
	 
		 public int sum(int a,int b) {
			 return a + b;
		 }
		 public double sum(double a,double b) {
			 return a + b;
		 }
		 
		 public int sum(int a,int b, int c) {
			 return a + b + c;
		 }
}
