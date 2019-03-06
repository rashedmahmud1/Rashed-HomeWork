package com.tt.Summon;

import java.util.ArrayList;
import java.util.ListIterator;


public class Pr2 {

	public static void main(String[] args) {
		ArrayList<String> so = new ArrayList<String>();
		so.add("rat");
		so.add("cat");
		so.add("dog");
		so.add("cow");
	//	System.out.println(so);
		ListIterator<String> lt = so.listIterator();
		while(lt.hasNext())
		System.out.println(lt.next());
		
		
		
		
	

	}

}
