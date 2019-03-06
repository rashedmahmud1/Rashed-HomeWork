package ArrarDemo;

import java.util.ArrayList;

public class Arrayadd {

	public static void main(String[] args) {
		String[] gazi = {"sumon","sohel","Tareq","gazi"};
		ArrayList<String> s = new ArrayList<String>();
		for(String x : gazi) {
			s.add(x);
			System.out.println(s);
			System.out.println("________________");
		}
		System.out.println("-------------");
		System.out.println(s);
	}

}
