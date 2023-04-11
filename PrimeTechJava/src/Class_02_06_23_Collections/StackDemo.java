package Class_02_06_23_Collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> colors = new Stack<String>();
		colors.push("red");
		colors.push("black");
		colors.push("white");
		
		System.out.println(colors);
		System.out.println(colors.pop());
	}
  
}
