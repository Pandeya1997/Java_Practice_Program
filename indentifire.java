package JAVA_Exam_10_02_2026;

public class indentifire {  // class identfire 

	public static void main (String [] arg ) {
		indentifire obj = new indentifire();
		 obj.sum();
		 
		
	} 
	void sum() {
		int a = 5; 
		int b = 10;
		int c = a+b;
		int d= b-a;
		int e = a*b;
		int f= b/a;
		
		System.out.println("sum of two variable"+" = "+c);
		System.out.println("subtract two values"+" = "+ d);
		System.out.println("multiple tow values"+ " = "+ e);
		System.out.println("div of tow values"+" = "+f);
		
	}
	
}
