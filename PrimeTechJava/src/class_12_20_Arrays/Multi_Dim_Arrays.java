package class_12_20_Arrays;

public class Multi_Dim_Arrays {

	public static void main(String[] args) {
		
		int [][]a = new int[3][2];
		
		
      a[0][0]= 100;
      a[0][1]= 200;
      
      a[1][0]= 300;
      a[1][1]= 400;
      
      a[2][0]= 500;
      a[2][1]= 600;
      
     
      // how to find the size of an array(rows, columns) 
      
      
     System.out.println("Numbers of rows: " + a.length);
     
     System.out.println("Number of colums: "+a[0].length);
      // int [] [] a= { {100,200}, {300,400},{500,600} };
     
      //a[].length this how to find number of columns. 
     
     
	}

}
