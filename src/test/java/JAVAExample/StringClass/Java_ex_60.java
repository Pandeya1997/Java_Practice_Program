package JAVAExample.StringClass;

public class Java_ex_60 {
    public static void main(String[] args) {

    String s1 = "Hello";
    String s2 = "He"+ "llo";
    String s3 = new String("He")+ "llo";


        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s2.equals(s3));
         
    }
}
//"He" + "llo" → compile-time → goes to String Pool
//new String("He") + "llo" → runtime → new object in heap