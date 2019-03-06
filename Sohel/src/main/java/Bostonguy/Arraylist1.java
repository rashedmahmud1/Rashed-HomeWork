package Bostonguy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class Arraylist1 {

	public static void main(String[] args) {
		
		String sohel []= {"dog","cat","horse","bird"};
		
		ArrayList<String> sumon = new ArrayList<String>();
		
		for(String x:sohel)
			sumon.add(x);
		sumon.add("eggs");
		sumon.add("cats");
		sumon.add("dogs");
		sumon.add("cats");
		
		
		ListIterator<String> itr = sumon.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
	}
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

		System.out.println(sumon);
		
		HashSet s =new HashSet(sumon);
		
		System.out.println(s);
	}

}
