package SohelInterViewPrer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayReverse {

	public static void main(String[] args) {
		ArrayList<String> ab = new ArrayList<String>();
		ab.add("banana");
		ab.add("apple");
		ab.add("cherry");
		ab.add("grape");
		ListIterator<String> it = ab.listIterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println("--------------");
		while(it.hasPrevious())
			System.out.println(it.previous());
		
		
		

	}

}
