package CompiePolyMorphism;

public class CompileDemo1 {

	public static void main(String[] args) {
		CompileDemo1 obj1 = new CompileDemo1();
		
		obj1.add(4, 5);
		obj1.add(1, 2, 3);
		obj1.add(2.3, 3.5);
		obj1.add(2, 2.3);
		
		}//end of main method
	public void add (int a,double b) {
		double c = a+b;
		System.out.println("sum of this number:"+c);
	}
	
	public void add(double a,double b) {
		double c = a+b;
		System.out.println("sum of double number:"+c);
		}
	
	public void add(int a,int b) {
		int c = a+b;
		System.out.println("sum of number is:"+c);
		}
	
	public void add(int a,int b,int c) {
		int d = a+b+c;
		System.out.println("sum of num bers is:"+d);
	}

}//end of class
