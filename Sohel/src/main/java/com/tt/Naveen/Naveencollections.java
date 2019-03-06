package com.tt.Naveen;

import java.util.ArrayList;
import java.util.Iterator;

public class Naveencollections {

	

	public static void main(String[] args) {
		Employees ar1 = new Employees("sohel", 29,"qa");
		Employees ar2 = new Employees("sam", 39,"dev");
		Employees ar3 = new Employees("john", 25,"edm");
		
		ArrayList<Employees> em = new ArrayList<Employees>();
		em.add(ar1);
		em.add(ar2);
		em.add(ar3);
		
		Iterator<Employees> it = em.iterator();
		while(it.hasNext()) {
			Employees x = it.next();
			System.out.println(x.name);
			System.out.println(x.age);
			System.out.println(x.dep);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	//Employees class objects
		Employees em1 = new Employees("sohel",29,"qa");
		Employees em2 = new Employees("john",39,"dev");
		Employees em3 = new Employees("smith",32,"edm");
		
		//creating arraylist
		ArrayList <Employees> ar = new ArrayList <Employees>();
		ar.add(em1);
		ar.add(em2);
		ar.add(em3);
		// iterator to traverse the value
		Iterator<Employees> it = ar.iterator();
		while(it.hasNext()) {
			Employees em = it.next();
			System.out.println(em.name);
			System.out.println(em.age);
			System.out.println(em.dep);
		}*/
		
		

	}

}
