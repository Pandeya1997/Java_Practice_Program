package JAVAExample.Loops.if_elsecase;

import java.util.Scanner;

public class Java_ex_98 {
    public static void main(String[] args) {

//        Simple Calculator

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your 1st number:");
        int num1 = sc.nextInt();

        System.out.println("Enter your 2nd number:");
        int num2 = sc.nextInt();

        System.out.println("Enter your operation like +, -, *, / :");
        String op = sc.next();

        if (op.equals("+")) {
            System.out.println("Two numbers added --> " + (num1 + num2));
        } else if (op.equals("-")) {
            System.out.println("Two numbers subtracted --> " + (num1 - num2));
        } else if (op.equals("*")) {
            System.out.println("Two numbers multiplied --> " + (num1 * num2));
        } else if (op.equals("/")) {
            if (num2 != 0) {
                System.out.println("Two numbers division --> " + (num1 / num2));
            } else {
                System.out.println("Division by zero is not allowed");
            }
        } else {
            System.out.println("Invalid operation");
        }

        sc.close();



    }
}
