package com.tt.Sohel;
import java.util.Scanner;
public class Variable {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	NewClass obj = new NewClass();
	
	System.out.println("enter your name here :");
	String name = input.nextLine();
	obj.simplemessage(name);
	
	 
            
	}//end of method

}//end of main class
