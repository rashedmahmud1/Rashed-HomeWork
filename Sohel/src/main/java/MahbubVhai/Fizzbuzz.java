package MahbubVhai;

public class Fizzbuzz {

	public static void main(String[] args) {
		int x[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		
		for(int i =0;i<x.length;i++) {
			if(x[i]%3==0&&x[i]%5==0) 
				System.out.println("Fizzbuzz");
				else if (x[i]%3==0)
					System.out.println("Fizz");
				else if (x[i]%5==0)
              System.out.println("Buzz");
              else
            	  System.out.println(x[i]);
				
		}
	}
		
}
	


