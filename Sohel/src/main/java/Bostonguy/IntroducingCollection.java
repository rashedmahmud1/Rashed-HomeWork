package Bostonguy;

import java.util.ArrayList;

public class IntroducingCollection {

	public static void main(String[] args) {
		String []things= {"eggs","lasers","hats","pie"};
		ArrayList<String> list1 = new ArrayList<String>();
		//adds array item to list
		for(String x : things)
			list1.add(x);
		String [] moreitem = {"lasers","hats"};
		ArrayList<String> list2 = new ArrayList<String>();
		for(String y : moreitem)
			list2.add(y);
		for(int i = 0;i<list1.size();i++) {
			
		
			System.out.printf(" %s ", list1.get(i));	

		}
	}
}
