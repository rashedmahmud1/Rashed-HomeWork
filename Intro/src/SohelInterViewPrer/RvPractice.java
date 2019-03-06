package SohelInterViewPrer;

import java.util.ArrayList;
import java.util.ListIterator;

public class RvPractice {
	public  static void main(String[]args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("ad");
		ar.add("ad");
		ar.add("cd");
		ar.add("fv");
		ListIterator it = ar.listIterator();
		while(it.hasNext())
			System.out.println(it.next());
		    System.out.println("------------");
		while(it.hasPrevious())
			System.out.println(it.previous());
		
		
		
	}

}
