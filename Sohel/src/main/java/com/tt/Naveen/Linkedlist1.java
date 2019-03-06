package com.tt.Naveen;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist1 {

	public static void main(String[] args) {
		LinkedList<String> ss = new LinkedList<String>();
		
		ss.add("sherish");
		ss.add("suheera");
		ss.add("sohel");
		ss.add("mahmud");
		System.out.println(ss);
		System.out.println("____________________________");
		for(int i = 0;i<ss.size();i++) {
			System.out.println(ss.get(i));
		}
		System.out.println("____________________________");
		for(String st : ss) {
			System.out.println(st);
		}
		System.out.println("____________________________");
		Iterator<String> it = ss.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println("____________________________");
		
		int w = 0;
		while(ss.size()>w) {
			System.out.println(ss.get(w));
			w++;
		}
		
		

	}

}
