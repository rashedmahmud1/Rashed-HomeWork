package com.tt.muktaapa;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

	public static void main(String[] args) {
	LinkedList<Integer> List = new LinkedList<Integer>();
		List.add(10);
		List.add(11);
		List.add(13);
		
		System.out.println(List.size());
		System.out.println(List.get(0));
		
		List.remove(1);
		
		for(int age : List) {
			System.out.println(age);
		}
		

	}

}
