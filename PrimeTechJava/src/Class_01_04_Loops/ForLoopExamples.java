package Class_01_04_Loops;

import java.util.Arrays;

public class ForLoopExamples {

	public static void main(String[] args) {
		
		// Print number from 1 - 10;
//		for(int i=1; i<=10;i++) {
//			 System.out.println(i); 
//		}
//		  
		 // print numbers from 10 -1
//		for(int i=10; i>=1;i--) {
//			
//			System.out.println(i);
//		}

		
		/*⇒ Given below integer array, write a for loop 
		statement that prints array elements from 
		last to the first
			[1,2,3,4,5,6,7]*/
//		int[] arr = {1,2,3,4,5,6,7};
//		for(int i=7; i>=1;i--) {
//			System.out.println(i);
//		}
		//Using for loop to create integer array that has elements from 1 - 5;
        int[] arr = new int[5];
        for(int i= 0;i<arr.length;i++) {
        	arr[i] = i + 1;
        	
        }
        System.out.println(Arrays.toString(arr));
        
        
	}

}
