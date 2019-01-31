package ArrarDemo;

public class SingleArraydemo2 {

	public static void main(String[] args) {
	
		int student_id[]=new int[5];
		
		student_id[0]=89;
		student_id[1]=99;
		student_id[2]=84;
		student_id[3]=85;
		student_id[4]=86;
		
		int sizeofArray=student_id.length;
		System.out.println("size of Array:"+sizeofArray);
		for(int i=0;i<sizeofArray;i++) {
			
			System.out.println("student id is:"+student_id[i]);
			}//end of for loop
		
		
		
		
	}//end of main method
	
	
}//end of class
		