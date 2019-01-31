package com.tt.Sohel;

public class BKNestedif{
	
		
		public static void main(String[] args) {
		int age = 20;
		if (age < 10) {
			System.out.println("You are young");
			
		
		
		}else {
			System.out.println("You are old");
			if(age<25) {
				System.out.println("You are really old");
				
			}else {
				System.out.println("You are young");
			}
		}
	
		}//end of main method
	
}//end of class