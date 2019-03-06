package com.tt.Sohel;
import java.util.Scanner;

public class BkParamiter {

		private static final String String = null;

		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Tuna2 obj = new Tuna2(String );
		System.out.println("Enter name of first gf here: ");
		String temp = input.nextLine();
		obj.setName(temp);
		obj.saying();
		

	}

		
}
