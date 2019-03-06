package com.tt.Sohel;
import java.util.Scanner;
public class Constractor {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	Apple appleobj = new Apple();
	System.out.println("Enter your name here:");
	String name = input.nextLine();
	appleobj.simpleMessage(name);
			
		
	

	}//end of main method

}//end of class
