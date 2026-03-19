package JAVA_Exam_17_03_2026_Variable;

public class java_ex_17 {
    int x  ;
    public static void main (String []arg) {
    	java_ex_17 t = new java_ex_17();
    	System.out.println("JVM will provide default value for instance variable;- "+ t.x);
    	//Instance variable object ke andar hota hai. Agar initialize nahi karte, to JVM default value de deta hai.
    }
}
