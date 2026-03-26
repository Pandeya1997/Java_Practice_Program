package JAVAExample.StringClass;

public class Java_ex_63 {
    public static void main(String[] args) {

        String s1 = new String("Java");
        String s2 = "Java";
        String s3 = s1.intern();

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        // String s1 = new String (java);
        // heap memory , every time new object create

        // String s2 = "java ";
        //  String pool  Direct use

        //  String s3 = s1.inter();
        // inter pool ;- same string pool searching
        // avilable the refrences values transfer

        // s1 ==s2 ? false  , heap vs pool
        // s2 == s3 ? true  same point , pool memory resuse


    }
}
