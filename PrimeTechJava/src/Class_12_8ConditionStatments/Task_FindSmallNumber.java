package Class_12_8ConditionStatments;

public class Task_FindSmallNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1 = 10;
int num2 = 20; 
int num3 = 30;
int num4=  5;
if(num1<num2 && num1<num3 && num1<num4) {
	System.out.println("Smallest number is: " +num1);
} else if(num2<num1 && num2<num3 && num2<num4) {
	System.out.println("Smallest number is: "+ num2);
}else if(num3<num1 && num3<num2 && num3<num4) {
	System.out.println("Smallest number is: "+ num3);
}else {
	System.out.println("Smallest number is: "+ num4);
}

	} 

}
