package Bostonguy;

public class Recursion {

	public static void main(String[] args) {
		System.out.println(fact(5));
	 }//end main of method
	public static long fact(long n) {
		if(n <=1)
			return 1;
		else
			return n * fact(n-1);
	}

}//end of class
