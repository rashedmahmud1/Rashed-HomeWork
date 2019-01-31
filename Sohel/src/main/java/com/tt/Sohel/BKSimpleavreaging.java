package com.tt.Sohel;
import java.util.Scanner;


public class BKSimpleavreaging {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total = 0;
		int grade;
		int avarage;
		int counter = 0;
		
		while(counter<10) {
			grade = input.nextInt();
			total = total+grade;
			counter++;
			}
		avarage = total/10;
		System.out.println("your avarage is :"+avarage);

	}//end of main method

}//end of class
