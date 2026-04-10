package JAVAExample.Loops.SwitchCase;

import java.util.Scanner;

public class Java_ex_125_Ternaryopretor_Largest_fur_Number {
    public static void main(String[] args) {
/*
Largest three Number

int max = (num1 > num2) ? ((num1 > num3) ? ((num1 > num4) ? num1 : num4) : ((num3 > num4) ? num3 : num4))
                        : ((num2 > num3) ? ((num2 > num4) ? num2 : num4) : ((num3 > num4) ? num3 : num4));
 */
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd Number");
        int num3 = sc.nextInt();
        System.out.println("Enter 4th Number");
        int num4 = sc.nextInt();

//        int num1 = 54;
//        int num2 = 4;
//        int num3 = 3;
//        int num4 = 44;
        int Max;
        Max= ((num1 >num2
                ?((num1>num3)
                ? ((num1>num4)?num1:num4)
                :num3>num4 ? num3: num4)
                : (num2>num3)
                ? ((num2>num4)?num2:num4)
                :(num3>num4)?num3:num4));
        System.out.println("Largest Of three Number -->" + Max);


sc.close();
    }
}
//max = (num1 > num2)
//         ? ((num1 > num3)
//        ? (num1 > num4 ? num1 : num4)
//        : (num3 > num4 ? num3 : num4))
//        : ((num2 > num3)
//        ? (num2 > num4 ? num2 : num4)
//        : (num3 > num4 ? num3 : num4));