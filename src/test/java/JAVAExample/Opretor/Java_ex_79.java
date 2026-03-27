package JAVAExample.Opretor;

public class Java_ex_79 {
    public static void main(String[] args) {
        int a = 210, b = 25, c = 115 , d = 20;

        int max = (a > b)
                ? (a > c
                ? (a > d ? a : d)
                : (c > d ? c : d))
                : (b > c
                ? (b > d ? b : d)
                : (c > d ? c : d));

        System.out.println(max);
    }


}
