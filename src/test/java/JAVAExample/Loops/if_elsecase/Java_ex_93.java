package JAVAExample.Loops.if_elsecase;

import java.util.Scanner;

public class Java_ex_93 {
    public static void main(String[] args) {

        //Even/Odd + Divisible by 5

        Scanner sc = new Scanner(System.in);
        System.out.println("enter yout number ");
        int num = sc.nextInt();

        if  (num % 2 == 0 && num % 5 == 0) {
            System.out.println("Even and divisible by 5");
        } else if (num %2 ==0) {
            System.out.println("Even Number");
        }
        else {
            System.out.println("odd Number");
        }

        sc.close();

    }
}
