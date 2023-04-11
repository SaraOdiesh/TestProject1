package class_02_02_23_Polymorphism;

public class Result_Multi_Sum {

	public static void main(String[] args) {
		OverLoading obj= new OverLoading();
		System.out.println("5 * 5 = " + obj.multiplay(5, 5));
		System.out.println("5.5 * 5.5 = " + obj.multiplay(5.5, 5.5));
		System.out.println("5 * 5 * 5 = " + obj.multiplay(5, 5, 5));
		
		
		System.out.println("5 + 5 = " + obj.sum(5, 5));
		System.out.println("3.5 + 3.5 = " + obj.sum(3.5, 3.5));
		System.out.println("5 + 5 + 5 = " + obj.sum(5, 5, 5));
		

	}

}
