package JAVAExample.Loops.if_elsecase;

import java.util.Scanner;

public class Java_ex_106 {
    public static void main(String[] args) {
 // Check the Number Prime Number
 Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number ");
        int input = sc.nextInt();

        boolean isPrime = true;

        if (input < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= input / 2; i++) {
                if (input % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }

         sc.close();
    }
}
