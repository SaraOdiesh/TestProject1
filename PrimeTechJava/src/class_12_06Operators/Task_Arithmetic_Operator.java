package class_12_06Operators;

public class Task_Arithmetic_Operator {

	public static void main(String[] args) {
		// Arithmetic Operator -->  +,-,*,/,%
		System.out.println("Arithmetic Operators");
		
int a= 10;
int b= 20;
System.out.println("Sum of a and b is: " +(a+b));
System.out.println("Diff of a and b is: " +(b-a));
System.out.println("mul of a and b is: " +(a*b));
System.out.println("Div of a and b is: " +(a/b));
System.out.println("Mod of a and b is: " +(a%b));
// Relational Operators (Comparison operators) ---> ==, >, <, <=,>=, !=
// Always return boolean value
System.out.println("---------Relational Operators--------");

System.out.println(a==b); // False
System.out.println(a<=b);
System.out.println(a>=b);
System.out.println(a<b);
System.out.println(a>b);
System.out.println(a!=b);
// Logical operator &&, ||, !
boolean x=true;
boolean y=false;
System.out.println("--------Logical Oerators--------");

System.out.println(x&&y);
System.out.println(x||y);
System.out.println(!x);
System.out.println(!y);

// increment/decrement operators ++, --
a=10;
 a++;     //a=a+1;
System.out.println(a);
b=20;
b--;//b=b11
System.out.println(b);


	}

}
