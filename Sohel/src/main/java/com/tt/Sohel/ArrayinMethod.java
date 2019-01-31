package com.tt.Sohel;

public class ArrayinMethod {

	public static void main(String[] args) {
		int sohel[] = {2,3,4,5};
		change(sohel);
		
		for(int y:sohel)
		 System.out.println(y);

	

	}//end of main method
	
	public static void change(int x[]) {
		for(int counter=0;counter<x.length;counter++)
	     x[counter]+=5;
			
	}

}//main class
