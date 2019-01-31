package InheritanceDemo;

public class ChildClass extends BaseClass {

	public static void main(String[] args) {
		ChildClass obj1= new ChildClass();
		obj1.add();
		obj1.div();
		obj1.mul();
		obj1.sub();
	  }
	
	public void div() {
		System.out.println("hey im am on child class and div is 20");
	}
	
	public void mul() {
		System.out.println("hey i am on child class and mul is 50");
	}

}
