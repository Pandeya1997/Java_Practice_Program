package JAVAExample.Casting;

public class Java_ex_47 {
    public static void main(String[] args) {
       byte b = 10;
       int a = b; // implicit casting
        float f = a; // implicit casting
        int a1 = (int)a; // Explicit casting
        byte b1 = (byte) a; // Explicit casting
        System.out.println(b);
        System.out.println(a);
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(f);

    }
}

