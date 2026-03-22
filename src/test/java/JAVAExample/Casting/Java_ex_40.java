package JAVAExample.Casting;

public class Java_ex_40 {
    public static void main(String[] args) {

        int a1 = 300;
        double d = a1;
        System.out.println("implicit casting " + d);

        byte b1 = (byte) a1; // Explicty casting
        System.out.println("Explicit:" + b1);

    }
}
