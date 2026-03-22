package JAVAExample.Casting;

public class Java_ex_42 {
    public static void main(String[] args) {

//        Widening Casting in Java (Implicit Casting)
//        Widening ka matlab hota hai:
//       👉 chhote data type ko bade data type me convert karna
//        Isko Implicit Casting bhi bolte hain kyunki ye automatic hota hai (JVM khud karta hai)
//        byte → short → int → long → float → double

        int a = 10;
        double b = a;   // widening (automatic)

        System.out.println(b);  // 10.0
    }
}
