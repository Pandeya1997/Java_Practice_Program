package JAVAExample.Loops.SwitchCase;

import java.util.Scanner;

public class Java_ex_124_Ternaryopretor_Largest_three_Number {
    public static void main(String[] args) {
/*
Largest three Number

int max = (num1 > num2) ? ((num1 > num3) ? ((num1 > num4) ? num1 : num4) : ((num3 > num4) ? num3 : num4))
                        : ((num2 > num3) ? ((num2 > num4) ? num2 : num4) : ((num3 > num4) ? num3 : num4));
 */
    Scanner sc = new Scanner(System.in);
//        System.out.println("Enter First Number");
//        int num1 = sc.nextInt();
//        System.out.println("Enter 2nd Number");
//        int num2 = sc.nextInt();
//        System.out.println("Enter 3rd Number");
//        int num3 = sc.nextInt();



        int num1 = 30;
        int num2 = 13;
        int num3 = 15;

        int Max = ((num1 >num2 ?((num1>num3)? num1 :num3): (num2>num3)? num2:num3));
        System.out.println("Largest Of three Number -->" + Max);


sc.close();
    }
}