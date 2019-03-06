package com.tt.Summon;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("put a string");
		Scanner xc = new Scanner(System.in);
		String s= xc.nextLine();
		String x = "";
		for(int i=s.length()-1;i>=0;i--) {
			x=x+s.charAt(i);
		}
		System.out.println(x);
		
		
		
		
		
		// how you reverse a string?
		/*String sohel = "somon";
		String x="";
		for(int i=sohel.length()-1;i>=0;i--) {
			x=x+sohel.charAt(i);
		}
		System.out.println(x);*/
	}

}
