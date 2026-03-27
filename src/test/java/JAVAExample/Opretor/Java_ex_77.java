package JAVAExample.Opretor;

public class Java_ex_77 {
    public static void main(String[] args) {
        int a = 210, b = 25, c = 115;

        int max = (a > b)
                ? (a > b ? a : b)
                : (b > c ? b : c);
        System.out.println(max);
    }


}
