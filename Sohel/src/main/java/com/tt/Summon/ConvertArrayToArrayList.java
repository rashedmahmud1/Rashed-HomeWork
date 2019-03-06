package com.tt.Summon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
	 String [] sohel = {"dog","cat","tom","rat"};
	 
	// Arrays.sort(sohel);
	// System.out.println(Arrays.toString(sohel));
	//how dp you reverse an array?
	 //how do you create arraylist from array
	 //how you 
	 ArrayList<String> ar1 = new ArrayList<String>();
	 for(String x : sohel) {
		 ar1.add(x);
		 }
	 System.out.println(ar1);
	 System.out.println("____________");
	 
	 //arraylist
	 ListIterator<String> it =  ar1.listIterator();
	 while(it.hasNext())
		 System.out.println(it.next());
	 System.out.println("______________");
	 
	 //reverse arraylist
	 	 while(it.hasPrevious())
		 System.out.println(it.previous());

	}

}
