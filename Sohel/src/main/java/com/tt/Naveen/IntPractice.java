package com.tt.Naveen;

import java.util.ArrayList;
import java.util.Iterator;

public class IntPractice {

	public static void main(String[] args) {
		ArrayList so = new ArrayList();
		so.add("a");
		so.add("b");
		so.add("c");
		so.add("d");
		for(int i = 0;i<so.size();i++) {
			System.out.println(i);
		}
		IntPrep1 em1 = new IntPrep1("a", 5, "boy");
		IntPrep1 em2 = new IntPrep1("b", 7, "girl");
		IntPrep1 em3 = new IntPrep1("c", 19, "teen");
		ArrayList<IntPrep1> al = new ArrayList<IntPrep1>();
		al.add(em1);
		al.add(em2);
		al.add(em3);
		
		Iterator<IntPrep1> it = al.iterator();
		while(it.hasNext()) {
			IntPrep1 em=it.next();
			System.out.println(em.name);
			System.out.println(em.age);
			System.out.println(em.dep);
		}
	
		
	
		
		

	}

}
