package JAVAExample.Opretor;

public class Java_ex_78 {
    public static void main(String[] args) {
        int a = 210, b = 25, c = 115;

        int min = (a < b)
                ? (a < b ? a : b)
                : (b < c ? b : c);
        System.out.println(min);
    }


}
