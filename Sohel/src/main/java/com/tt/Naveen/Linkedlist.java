package com.tt.Naveen;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> ss = new LinkedList<String>();
		//add list:
		ss.add("Test");
		ss.add("qtp");
		ss.add("selenium");
		ss.add("jira");
		ss.add("java");
		ss.add("sql");
		//print the list:
		System.out.println("content of linkedlist: " +ss);
		//add first: 
		ss.addFirst("suheera");
		//add last:
		ss.addLast("sherish");
		System.out.println("content of linkedlist: " +ss);
		
		//add get //add set :
		
		//ss.getFirst();
		System.out.println(ss.getFirst());
		ss.set(1,"stlc");
		System.out.println(ss.get(1));
		// Remove first and last element
		ss.removeFirst();
        ss.removeLast();
		System.out.println("content of linkedlist: " +ss);
		//how to print all the value of linkedlist:
		//for loop
		System.out.println("---------------");
		for(int i = 0;i<ss.size();i++) {
			System.out.println(ss.get(i));
		}
		//Advance for loop:
		System.out.println("---------------");
		
		for(String st : ss) {
			System.out.println(st);
		}
		System.out.println("---------------");
		//iterator loop
		Iterator<String> it = ss.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//while loop
		System.out.println("---while loop------------");
		int num = 0;
		while(ss.size()>num) {
			System.out.println(ss.get(num));
			num++;
		}
		
		
		
	 
	

	}

}
