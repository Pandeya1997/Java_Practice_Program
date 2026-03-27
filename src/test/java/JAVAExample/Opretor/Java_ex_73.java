package JAVAExample.Opretor;

public class Java_ex_73 {
    public static void main(String[] args) {
//              3_/ (x^2 + y^2 - |z|)
//              x= 10 , y =12.4 , z = 56.78
        // x*x =10 * 10 = 100
        // y*y = 12.4 * 12.4 = 153.76

        double x = 10 ;
        double y = 12.4 ;
        double z = 56.78;

//        x = x*x ;
//        y = y*y;
//        double result = Math.cbrt(x+y- Math.abs(z));

        double result = Math.cbrt((x * x) + (y * y) - Math.abs(z));

        System.out.println(result);



    }


}
