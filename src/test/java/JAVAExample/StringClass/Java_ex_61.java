package JAVAExample.StringClass;

public class Java_ex_61 {
    public static void main(String[] args) {

    String s1 = "Hello";
    String s2 = s1.intern();


        System.out.println(s1 == s2);

    }
}
//== compares reference, .equals() compares content.
//Strings in Java use a String Pool, so literals may refer to the same object, but objects created with new always create new memory