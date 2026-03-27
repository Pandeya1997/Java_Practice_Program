package JAVAExample.Opretor;

public class Java_ex_80 {
    public static void main(String[] args) {
        int a = 210, b = 25, c = 115 , d = 20;

        int max = Math.max(a, Math.max(b, Math.max(c, d)));
        System.out.println("Maximum number of a,b,c,d --> " + max);
        int min = Math.min(a,Math.min(b,Math.min(c,d)));
        System.out.println("Minum Number of a,b,c,d --> " + min);
    }


}
