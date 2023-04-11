package Class_01_04_Loops;

import java.util.Arrays;

public class LoopsDemo {

	public static void main(String[] args) {
		
		// intitization; Condition;  increment  
		// iterator or iteration step
//		for(int i=1; i<=100; i++) {
//		
//		System.out.println(i);
//		
//		
//	
//		}
		
//		for(int i=0;i<15;i++) {
//			//System.out.println(i);
//			System.out.println("Hello Wolrd");
//			System.out.println("I Love Java");
//			
//		}
//		System.out.println("outSide of the for loop");
//	for(int i =3; i<=10;i++) {
//		
//		System.out.println(i);
//		
//	}
//	// prints numbers from 10-5:10,9,8,7,6,5
//	for(int i=10;i>=5;i--) {
//		
//		System.out.println(i);
//	}
		
//		
//			int []arr = {1,2,3,4,5,6,7};
//			for(int i=arr.length-1;i>=0;i--) {
//				System.out.println(arr[i]);
//			}
//		
		
//		int [] arr = new int[5];
//		for(int i=0 ;i<arr.length;i++) {
//			
//			arr [i] = i +1;
//			System.out.println(Arrays.toString(arr));
//			
//		}
		
//		int[]arr= {6,5,11,10,3,4,9};
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]% 2==0) {
//				
//				System.out.println(arr[i]);
//			}
//		}
//		
//		int[] arr = {1,2,3,4,5,6,7,8,9,10};
//		for(int i=1;i<arr.length;i++) {
//		System.out.println(i + "=" + i*i);
//		}
		
		for(int i=1;i<=30;i++) {
		if(i%2==0) {
			System.out.println("Even number: " + i);
		} else {
			System.out.println("Odd number: " + i);
		}
	}
	}
}
