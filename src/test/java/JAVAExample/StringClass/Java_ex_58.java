package JAVAExample.StringClass;

public class Java_ex_58 {
    public static void main(String[] args) {

        String s1 = new String("Hello");
       String s2 = new String("Hello");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

//        new creates separate objects in heap
//        Different memory → == is false
//        Same value → .equals() is true


         
    }
}
