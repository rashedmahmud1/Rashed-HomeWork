package com.tt.Naveen;

import java.util.ArrayList;

public class PracticeAddandRmove {

	public static void main(String[] args) {
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("sql");
		ar1.add("java");
		ar1.add("selenium");
		
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("sql");
		ar2.add("stlc");
		ar2.add("jira");
		
		/*ar1.addAll(ar2);
		for(int i = 0;i<ar1.size();i++) {
			System.out.println(ar1.get(i));
		}
		System.out.println("...............");
		
		
		ar1.removeAll(ar2);
		for(int i = 0;i<ar1.size();i++) {
			System.out.println(ar1.get(i));
		}*/
		System.out.println("...............");
		ar1.retainAll(ar2);
		for(int i = 0;i<ar1.size();i++) {
			System.out.println(ar1.get(i));
		}
		
		
		
		

	}

}
