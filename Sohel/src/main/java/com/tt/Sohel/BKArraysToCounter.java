package com.tt.Sohel;
import java.util.Random;

public class BKArraysToCounter {
   
    
	public static void main(String[] args) {
		 Random rand = new Random();
		    int sohel[] = new int [7];
		    
		for(int roll=1;roll<1000;roll++) {
			
			++sohel[1+rand.nextInt(6)];
		}
		

	}//end of main method

}//end of class
