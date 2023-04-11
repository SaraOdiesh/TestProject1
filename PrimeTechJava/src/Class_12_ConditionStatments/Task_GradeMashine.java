package Class_12_ConditionStatments;

public class Task_GradeMashine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int math    =80;
		int english = 95;
		int history =70;
		int average =(math + english + history) /3;
		if (average>=90 && average<=100) {
			System.out.println("A");
		} if(average>=80 && average<=89) {
			System.out.println("B");
		}else if (average>=70 && average<=79) {
			System.out.println("C");
		} else if (average>=60 && average<=69) {
			System.out.println("D");
		} else if (average>=0 && average<=59) {
			System.out.println("F");
		}

	}

}
