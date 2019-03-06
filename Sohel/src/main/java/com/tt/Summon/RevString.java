package com.tt.Summon;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		System.out.println("put in string");
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		String a = "";
		for(int i = x.length()-1;i>=0;i--) {
			a = a+x.charAt(i);
			
		}
System.out.println(a);
	}

}
