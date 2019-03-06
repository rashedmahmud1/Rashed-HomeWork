package com.tt.Naveen;

import java.util.ArrayList;

public class NaveencollectionAddAll {

	public static void main(String[] args) {
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Test");
		ar1.add("Selenium");
		ar1.add("Qtp");
		
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("python");
		ar2.add("ruby");
		ar2.add("java");
		
		ar1.addAll(ar2);
		for(int i = 0;i<ar1.size();i++) {
			System.out.println(ar1.get(i));
		}
		System.out.println("...............");
		
		ar1.removeAll(ar2);
		for(int i = 0;i<ar1.size();i++) {
			System.out.println(ar1.get(i));
		}
		
		

	}

}
