package com.tt.Sohel;

public class ArraysMultiDimansional {

	public static void main(String[] args) {
	 int firstarrays[][] = { {2,3,4,5},{6,7,8,9} };
	 int secondarrays[][] = { {10,11,12,13},{23,34,45,56},{333,334,335,336} };
	 
	 System.out.println("this is first arrays");
	 display(firstarrays);
	 
	 System.out.println("this is secound arrays");
	 display(secondarrays);

	}//end of main method
 
	public static void display(int x[][]){
		for(int row = 0;row<x.length;row++) {
			for(int column = 0;column<x[row].length;column++) {
				System.out.print(x[row][column]+"\t");
			}
			System.out.println();
		}
		
		
		
	}	
		
	
}//end of class
