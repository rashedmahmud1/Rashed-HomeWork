package com.tt.Naveen;

import java.util.ArrayList;
import java.util.Iterator;

public class Practice {

	public static void main(String[] args) {
		practiceConstractor ar1 = new practiceConstractor("sohel", 29, "qa");
		practiceConstractor ar2 = new practiceConstractor("tom", 19, "dev");
		practiceConstractor ar3 = new practiceConstractor("john", 39, "mg");
		
		ArrayList<practiceConstractor> em = new ArrayList<practiceConstractor>();
		em.add(ar1);
		em.add(ar2);
		em.add(ar3);
		
		Iterator<practiceConstractor> it = em.iterator();
		while(it.hasNext()) {
			practiceConstractor ey = it.next();
			System.out.println(ey.name);
			System.out.println(ey.age);
			System.out.println(ey.dep);
		}
			
		
		
		 
		
	  

	}

}
