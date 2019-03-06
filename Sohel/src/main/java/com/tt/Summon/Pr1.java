package com.tt.Summon;

import java.util.ArrayList;
import java.util.ListIterator;

public class Pr1 {

	public static void main(String[] args) {
	    String [] so = {"rat","dog","cat","cow"};
	    ArrayList<String> ar = new ArrayList<String>();
	    for(String x : so) {
	    	ar.add(x);
	    }
	    System.out.println(ar);
	   ListIterator<String> lt = ar.listIterator();
	   while(lt.hasNext()) {
		   System.out.println(lt.next());
	   }
	   while(lt.hasPrevious()) {
		   System.out.println(lt.previous());
	   }
	  
	}

}
