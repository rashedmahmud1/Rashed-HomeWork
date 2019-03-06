package com.tt.muktaapa;

import java.util.ArrayList;

public class MahbubVhaiArraylist {

	public static void main(String[] args) {
		ArrayList<String> List = new ArrayList<String>(); 
		List.add("Shagor");
		List.add("tapan");
		List.add("sumon");
		int s = List.size();
		System.out.println("Lenght is :"+s);
		System.out.println("Value:"+ List.get(1));
		//List.remove(2);
		//for(int i = 0;i<List.size();i++) {
			//System.out.println(List.get(i));
		//}
		List.add(0, "Tanni");
		
		for(String name : List) {
			System.out.println(name);
		}
		
		

		
	}

}
