package Bostonguy;

public class CommonStringArray {

	public static void main(String[] args) {
		String[] words = {"funk","chunk","furry","baconator"};
		// Enhanch loop; Start with.
		for(String w : words) {
			if(w.startsWith("fu"))
				System.out.println(w+ " starts with fu");
		}
		//end with
		for(String w : words) {
			if(w.endsWith("nk"))
				System.out.println(w +  " ends with nk");
		}

	}//end of method

}//end of class
