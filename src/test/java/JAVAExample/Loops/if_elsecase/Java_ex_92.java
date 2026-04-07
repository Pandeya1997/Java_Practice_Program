package JAVAExample.Loops.if_elsecase;

import java.util.Scanner;

public class Java_ex_92 {
    public static void main(String[] args) {

        //Even/Odd + Divisible by 5

        Scanner sc = new Scanner(System.in);
        System.out.println("enter yout number ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            if (num % 5 == 0) {
                System.out.println("Even and divisible by 5");
            } else {
                System.out.println("Even but not divisible by 5");
            }
        } else {
            System.out.println("Odd number");
        }

        sc.close();

    }
}
